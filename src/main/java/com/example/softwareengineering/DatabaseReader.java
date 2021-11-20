package com.example.softwareengineering;

import java.io.*;
import java.util.Arrays;

public class DatabaseReader {

    String location = "src/main/resources/com/example/softwareengineering/";//The location path of the database files
    String battingStats = "BattingStats.csv";//the name of the hitter database file
    String pitchingStats = "PitchingStats.csv";//the name of the pitcher database file
    static String[] allTeams;//the accessible list of all team names

    /**
     * DatabaseReader Default constructor
     * Default constructor for the DatabaseReader class
     */
    public DatabaseReader(){}

    /**
     * GetStatsMethod
     * Returns the full array of batters or pitchers from the database
     * @param name - call passed from User Interface of software
     */
    public Player[] getStats(String name){
        try {//A safeguard in case errors occur when accessing files for reading
            Player[] values;//Should be able to hold either an array of Hitters or Pitchers
            if (name.equals("b")) {//checks if the wanted array is batters or pitchers
                values = getBatters(new FileReader(location + battingStats));//sets the returning array to a set of hitter objects
            } else {//there are only 2 possible inputs
                values = getPitchers(new FileReader(location + pitchingStats));//sets the returning array to a set of pitcher objects
            }
            return values;//returns the now filled player array
        } catch (Exception e){//the output for when an error occurs
            e.printStackTrace();//a record of what the specific error is when something went wrong
            return null;//a return value is always needed to exit the function, even in case of errors
        }
    }

    /**
     * GetBattersMethod
     * Translates the data from the database file into a usable array of Hitter objects
     * @param stats - A filereader object with the location of where the database file is and what it is named
     */
    private Hitter[] getBatters(FileReader stats){
        String line;//A string to be used for temporarily holding information from the database until it can be formatted for an array
        String splitBy = ",";//the splitting point for different pieces of information from the database
        BufferedReader br = new BufferedReader(stats);//creating a buffered reader for reading in the FileReader stats
        int i = 0;//initialising the counter for tracking the size of the following array
        String[][] words = new String[100][];//initialising a 2 dimensional String array for storing player information from the file
        try {//ensuring the program does not fail upon a bad read of the database file
            while ((line = br.readLine()) != null) {//making sure there is more data to be read
                words[i++] = line.split(splitBy);//separating the information for each player into an array and then incrementing the counter
            }
        } catch (Exception e) {//the result if there is an error from the database file
            e.printStackTrace();//the output if there is an error
        }

        Hitter[] obj = new Hitter[i];//initializing an array of Hitter objects based on the amount of lines found earlier
        for(int j =0; j < i; j++){//A loop to fill all of the newly created objects with database information
            obj[j] = new Hitter(j + "", "hitter", Double.parseDouble(words[j][2]), Double.parseDouble(words[j][3]), Double.parseDouble(words[j][4]), Double.parseDouble(words[j][5]), Double.parseDouble(words[j][6]), Double.parseDouble(words[j][7]), Double.parseDouble(words[j][8]), Double.parseDouble(words[j][9]), Double.parseDouble(words[j][10]));
            obj[j].setPersonTeam(words[j][1]);
            obj[j].setPersonName(words[j][0]);
        }
        TableIterator hitter = new TableIterator();//Creating a new TableIterator
        hitter.setHitterInformation(words);//Setting the initial information for use when saving or exporting data

        return obj;//returning the finished Hitter array
    }

    /**
     * GetPitchersMethod
     * Translates the data from the database file into a usable array of Pitcher objects
     * @param stats - A filereader object with the location of where the database file is and what it is named
     */
    private Pitcher[] getPitchers(FileReader stats){
        String line;//A string to be used for temporarily holding information from the database until it can be formatted for an array
        String splitBy = ",";//the splitting point for different pieces of information from the database
        BufferedReader br = new BufferedReader(stats);//creating a buffered reader for reading in the FileReader stats
        int i = 0;//initialising the counter for tracking the size of the following array
        String[][] words = new String[100][];//initialising a 2 dimensional String array for storing player information from the file
        try {//ensuring the program does not fail upon a bad read of the database file
            while ((line = br.readLine()) != null) {//making sure there is more data to be read
                words[i++] = line.split(splitBy);//separating the information for each player into an array and then incrementing the counter
            }
        } catch (Exception e) {//the result if there is an error from the database file
            e.printStackTrace();//the output if there is an error
        }

        Pitcher[] obj = new Pitcher[i];//initializing an array of Pitcher objects based on the amount of lines found earlier
        for(int j = 0; j < i; j++) {//A loop to fill all of the newly created objects with database information
            obj[j] = new Pitcher(j + "", "pitcher", Double.parseDouble(words[j][2]), Double.parseDouble(words[j][3]), Double.parseDouble(words[j][4]), Double.parseDouble(words[j][5]), Double.parseDouble(words[j][6]), Double.parseDouble(words[j][7]), Double.parseDouble(words[j][8]), Double.parseDouble(words[j][9]), Double.parseDouble(words[j][10]), Double.parseDouble(words[j][11]));
            obj[j].setPersonName(words[j][0]);
            obj[j].setPersonTeam(words[j][1]);
        }
        TableIterator pitcher = new TableIterator();//Creating a new TableIterator
        pitcher.setPitcherInformation(words);//Setting the initial information for use when saving or exporting data

        return obj;//returning the finished Pitcher array


    }

    /**
     * SetTeams Mutator Method
     * Return a list of teams using all players in the database
     * @param hitters - player array of all hitters
     * @param pitchers - player array of all pitchers
     */
    public void setTeams(Player[] hitters, Player[] pitchers){
        String[] teams = new String[hitters.length+pitchers.length];
        Arrays.fill(teams, "");
        for(int i = 0; i < hitters.length; i++){
            int teamCheck = 0;
            for(int j = 0; j < teams.length; j++){
                if(teams[j].length() > 0 && teams[j].equals(hitters[i].getPersonTeam())){
                    teamCheck++;
                }
            }
            if(teamCheck == 0){//checking the Flag int to see if this team has been used before
                for(int j = 0; j < teams.length; j++){//looping through all teams to find the first empty slot
                    if(teams[j].equals("")){//finding the placement of the first empty index
                        teams[j] = hitters[i].getPersonTeam();//setting the last player's team to the open slot
                        j = teams.length;//leaving the loop
                    }
                }
            }
        }
        for(int i = 0; i < pitchers.length; i++){//looping through all hitters available
            int teamCheck = 0;//Flag int for if this teams has been found before
            for(int j = 0; j < teams.length; j++){//loop for all team names
                if(teams[j].length() > 0 && teams[j].equals(pitchers[i].getPersonTeam())){//checking all teams already found
                    teamCheck++;//increasing the Flag int
                }
            }
            if(teamCheck == 0){//checking the Flag int to see if this team has been used before
                for(int j = 0; j < teams.length; j++){//looping through all teams to find the first empty slot
                    if(teams[j].equals("")){//finding the placement of the first empty index
                        teams[j] = pitchers[i].getPersonTeam();//setting the last player's team to the open slot
                        j = teams.length;//leaving the loop
                    }
                }
            }
        }
        int totalLength = 1;//preparing to create an array of the actual number of teams, with an extra for setting the DisplayAll option
        for(int i = 0; i < teams.length; i++) {//checking all indexes for team names
            if (!teams[i].equals("")) {//finding each index of team names
                totalLength++;//increasing the count for what the actual number of team names is
            }
        }
        String[] finalTeams = new String[totalLength];//creating the array with the correct number of teams
        finalTeams[0] = "All";//Initializing the DisplayAll option
        for(int i = 1; i < totalLength; i++){//loop for setting all indexes of the array
            finalTeams[i] = teams[i-1];//offset to include the All option
        }
        allTeams = finalTeams;//setting the global variable for when it needs to be called upon later
    }

    /**
     * GetTeamsMethod
     * Return a string array of all team names
     */
    public static String[] getTeams(){
        return allTeams;
    }
}
