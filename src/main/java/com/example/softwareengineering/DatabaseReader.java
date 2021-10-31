package com.example.softwareengineering;

import java.io.*;

public class DatabaseReader {
    //CSV over SQL because I could only find that the paid version supports SQL
    String battingStats = "src/main/resources/com/example/softwareengineering/BattingStats.csv";
    String pitchingStats = "src/main/resources/com/example/softwareengineering/PitchingStats.csv";
    public DatabaseReader(){}

    //Returns the full array of batters or pitchers from the database
    public Player[] getStats(String name){
        try {
            FileReader stats;
            Player[] values;//Should be able to hold either an array of Hitters or Pitchers
            if (name.equals("b")) {
                stats = new FileReader(battingStats);
                values = getBatters(stats);
            } else {
                stats = new FileReader(pitchingStats);
                values = getPitchers(stats);
            }
            return values;
        } catch (Exception e){
            System.out.println("ERROR WITH FILES");
            return null;
        }
    }

    //batter stats array, the array values are numbered for the correct ones (there is also extra information
    //for further use)
    public Player[] getBatters(FileReader stats){
        Hitter[] obj = new Hitter[40];
        String line;
        String splitBy = ",";
        BufferedReader br = new BufferedReader(stats);
        int i = 0;
        String[] words;
        try {
            while ((line = br.readLine()) != null) {
                words = line.split(splitBy);
                for(int j = 0; j < words.length; j++){
                    System.out.println(words[j]);//For testing purposes
                }
                //this is just for the data right now as is, can be better formatted later
                obj[i] = new Hitter(i + "", "hitter",
                        Double.parseDouble(words[4]) + 0,
                        (Double.parseDouble(words[6]) + Double.parseDouble(words[7]) +
                            Double.parseDouble(words[8]) + Double.parseDouble(words[9])) + 0,
                        Double.parseDouble(words[6]) + 0,
                        Double.parseDouble(words[7]) + 0,
                        Double.parseDouble(words[8]) + 0,
                        Double.parseDouble(words[9]) + 0,
                        Double.parseDouble(words[13]) + 0,
                        Double.parseDouble(words[17]) + 0,
                        Double.parseDouble(words[6]) + 0);
                obj[i].setPersonName(words[0]);
                obj[i].setPersonTeam(words[1]);//For whatever reason, none of this will work*/

                i++;
            }
            System.out.println(obj[0].getPersonName());
            return obj;
        } catch (Exception e) {
            System.out.println("Something broke batterson");
            return null;
        }
    }

    //batter stats array, the array values are numbered for the correct ones (there is also extra information
    //for further use)
    public Player[] getPitchers(FileReader stats){
        Pitcher[] obj = new Pitcher[0];
        try {
            String line;
            String splitBy = ",";
            BufferedReader br = new BufferedReader(stats);
            int i = 0;
            String[] players;
            while ((line = br.readLine()) != null) {
                players = line.split(splitBy);
                //this is just for the data right now as is, can be better formatted later
                obj[i] = new Pitcher(i + "", "pitcher",
                        Double.parseDouble(players[8]) + 0,
                        Double.parseDouble(players[2]) + 0,
                        Double.parseDouble(players[3]) + 0,
                        Double.parseDouble(players[7]) + 0,
                        Double.parseDouble(players[6]) + 0,
                        Double.parseDouble(players[10]) + 0,
                        Double.parseDouble(players[12]) + 0,
                        Double.parseDouble(players[13]) + 0,
                        Double.parseDouble(players[11]) + 0,
                        Double.parseDouble(players[9]) + 0);//Unsure of B13, so Walks was used
                obj[i].setPersonName(players[0]);
                obj[i].setPersonTeam(players[1]);

                i++;
            }
            System.out.println(obj[0].getPersonName());
            return obj;
        } catch (Exception e) {
            System.out.println("Something broke pitcherson");
            return null;
        }
    }
}
