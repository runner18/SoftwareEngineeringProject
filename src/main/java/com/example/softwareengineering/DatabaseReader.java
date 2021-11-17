package com.example.softwareengineering;

import java.io.*;
import java.util.Arrays;

public class DatabaseReader {

    //CSV over SQL because I could only find that the paid version supports SQL
    String location = "src/main/resources/com/example/softwareengineering/";
    String battingStats = "BattingStats.csv";
    String pitchingStats = "PitchingStats.csv";
    static String[] allTeams;
    public DatabaseReader(){}

    //Returns the full array of batters or pitchers from the database
    public Player[] getStats(String name){
        try {
            FileReader stats;
            Player[] values;//Should be able to hold either an array of Hitters or Pitchers
            if (name.equals("b")) {
                stats = new FileReader(location + battingStats);
                values = getBatters(stats);
            }
            else {
                stats = new FileReader(location + pitchingStats);
                values = getPitchers(stats);
            }
            return values;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    //batter stats array, the array values are numbered for the correct ones (there is also extra information
    //for further use)
    public Hitter[] getBatters(FileReader stats){
        String line;
        String splitBy = ",";
        BufferedReader br = new BufferedReader(stats);
        int i = 0;
        String[][] words = new String[400][];
        try {
            while ((line = br.readLine()) != null) {
                words[i] = line.split(splitBy);
                i++;
            }
        } catch (Exception e) {
            System.out.println("Something broke batterson");
        }

        Hitter[] obj = new Hitter[i];
        for(int j =0; j < i; j++){
            obj[j] = new Hitter(j + "",
                    "hitter",
                    0 + Double.parseDouble(words[j][2]),
                    0 + Double.parseDouble(words[j][3]),
                    0 + Double.parseDouble(words[j][4]),
                    0 + Double.parseDouble(words[j][5]),
                    0 + Double.parseDouble(words[j][6]),
                    0 + Double.parseDouble(words[j][7]),
                    0 + Double.parseDouble(words[j][8]),
                    0 + Double.parseDouble(words[j][9]),
                    0 + Double.parseDouble(words[j][10]));

            obj[j].setPersonTeam(words[j][1]);
            obj[j].setPersonName(words[j][0]);
        }
        /*TableIterator hitter = new TableIterator();
        hitter.setHitterInformation(words);*/
        return obj;
    }

    //batter stats array, the array values are numbered for the correct ones (there is also extra information
    //for further use)
    public Pitcher[] getPitchers(FileReader stats){
        String line;
        String splitBy = ",";
        BufferedReader br = new BufferedReader(stats);
        int i = 0;
        String[][] words = new String[40][];
        try {
            while ((line = br.readLine()) != null) {
                words[i] = line.split(splitBy);
                i++;
            }
        } catch (Exception e) {
            System.out.println("Something broke pitcherson");
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
        /*TableIterator pitcher = new TableIterator();
        pitcher.setPitcherInformation(words);*/
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
        int totalLength = 0;
        for(int i = 0; i < teams.length; i++) {
            if (!teams[i].equals("")) {
                totalLength++;
            }
        }
        String[] finalTeams = new String[totalLength];
        for(int i = 0; i < totalLength; i++){
            finalTeams[i] = teams[i];
        }
        allTeams = finalTeams;
    }

    public static String[] getTeams(){
        return allTeams;
    }
}
