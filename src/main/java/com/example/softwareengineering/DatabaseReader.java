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
            }
            else {
                stats = new FileReader(pitchingStats);
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
        String[][] words = new String[40][];
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
            obj[j] = new Hitter(j + "", "hitter", 0 + Double.parseDouble(words[j][4]), 0 + (Double.parseDouble(words[j][6]) + Double.parseDouble(words[j][7]) + Double.parseDouble(words[j][8]) + Double.parseDouble(words[j][9])), 0 + Double.parseDouble(words[j][6]), 0 + Double.parseDouble(words[j][7]), 0 + Double.parseDouble(words[j][8]), 0 + Double.parseDouble(words[j][9]), 0 + Double.parseDouble(words[j][13]), 0 + Double.parseDouble(words[j][17]), 0 + Double.parseDouble(words[j][6]));

            obj[j].setPersonTeam(words[j][1]);
            obj[j].setPersonName(words[j][0]);
        }
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
            obj[j] = new Pitcher(j + "", "pitcher", Double.parseDouble(words[j][8]), Double.parseDouble(words[j][2]), Double.parseDouble(words[j][3]), Double.parseDouble(words[j][7]), Double.parseDouble(words[j][6]), Double.parseDouble(words[j][10]), Double.parseDouble(words[j][12]), Double.parseDouble(words[j][13]), Double.parseDouble(words[j][11]), Double.parseDouble(words[j][9]));
            obj[j].setPersonName(words[j][0]);
            obj[j].setPersonTeam(words[j][1]);
        }
        return obj;
    }
}
