package com.example.softwareengineering;

import java.io.*;
import java.util.Arrays;

public class DatabaseReader {

    //CSV over SQL because I could only find that the paid version supports SQL until well after this was working
    String location = "src/main/resources/com/example/softwareengineering/";
    String battingStats = "BattingStats.csv";
    String pitchingStats = "PitchingStats.csv";
    static String[] allTeams;

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
     * GetHittersMethod
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

        Hitter[] obj = new Hitter[i];
        for(int j =0; j < i; j++){
            obj[j] = new Hitter(j + "", "hitter", Double.parseDouble(words[j][2]), Double.parseDouble(words[j][3]), Double.parseDouble(words[j][4]), Double.parseDouble(words[j][5]), Double.parseDouble(words[j][6]), Double.parseDouble(words[j][7]), Double.parseDouble(words[j][8]), Double.parseDouble(words[j][9]), Double.parseDouble(words[j][10]));
            obj[j].setPersonTeam(words[j][1]);
            obj[j].setPersonName(words[j][0]);
        }
        TableIterator hitter = new TableIterator();
        hitter.setHitterInformation(words);
        //
        return obj;
    }

    /**
     * GetPitchersMethod
     * Translates the data from the database file into a usable array of Pitcher objects
     * @param stats - A filereader object with the location of where the database file is and what it is named
     */
    private Pitcher[] getPitchers(FileReader stats){
        String line;
        String splitBy = ",";
        BufferedReader br = new BufferedReader(stats);
        int i = 0;
        String[][] words = new String[100][];
        try {
            while ((line = br.readLine()) != null) {
                words[i] = line.split(splitBy);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Pitcher[] obj = new Pitcher[i];
        for(int j = 0; j < i; j++) {
            obj[j] = new Pitcher(j + "",
                    "pitcher",
                    Double.parseDouble(words[j][2]) + 0,
                    Double.parseDouble(words[j][3]) + 0,
                    Double.parseDouble(words[j][4]) + 0,
                    Double.parseDouble(words[j][5]) + 0,
                    Double.parseDouble(words[j][6]) + 0,
                    Double.parseDouble(words[j][7]) + 0,
                    Double.parseDouble(words[j][8]) + 0,
                    Double.parseDouble(words[j][9]) + 0,
                    Double.parseDouble(words[j][10]) + 0,
                    Double.parseDouble(words[j][11]) + 0);
            obj[j].setPersonName(words[j][0]);
            obj[j].setPersonTeam(words[j][1]);
        }
        TableIterator pitcher = new TableIterator();
        pitcher.setPitcherInformation(words);
        return obj;


    }

    //return a list of teams using all players in the database
    public void setTeams(Player[] hitters, Player[]pitchers){
        String[] teams = new String[hitters.length+pitchers.length];
        Arrays.fill(teams, "");
        for(int i = 0; i < hitters.length; i++){
            int teamCheck = 0;
            for(int j = 0; j < teams.length; j++){
                if(teams[j].length() > 0 && teams[j].equals(hitters[i].getPersonTeam())){
                    teamCheck++;
                }
            }
            if(teamCheck == 0){
                for(int j = 0; j < teams.length; j++){
                    if(teams[j].equals("")){
                        teams[j] = hitters[i].getPersonTeam();
                        j = teams.length;
                    }
                }
            }
        }
        for(int i = 0; i < pitchers.length; i++){
            int teamCheck = 0;
            for(int j = 0; j < teams.length; j++){
                if(teams[j].length() > 0 && teams[j].equals(pitchers[i].getPersonTeam())){
                    teamCheck++;
                }
            }
            if(teamCheck == 0){
                for(int j = 0; j < teams.length; j++){
                    if(teams[j].equals("")){
                        teams[j] = pitchers[i].getPersonTeam();
                        j = teams.length;
                    }
                }
            }
        }
        int totalLength = 1;
        for(int i = 0; i < teams.length; i++) {
            if (!teams[i].equals("")) {
                totalLength++;
            }
        }
        String[] finalTeams = new String[totalLength];
        finalTeams[0] = "All";
        for(int i = 1; i < totalLength; i++){
            finalTeams[i] = teams[i-1];
        }
        allTeams = finalTeams;
    }

    public static String[] getTeams(){
        return allTeams;
    }
}
