package com.example.softwareengineering;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TableIterator {
    private StringBuilder sb = new StringBuilder();
    private static String[][] hitterInformation;
    private static String[][] pitcherInformation;
    private static int hitIndex = 0;
    private static int pitchIndex = 0;
    private String directory = "src/main/resources/com/example/softwareengineering/";

    public void writeToFile(){
        sb = new StringBuilder();
        hitWriting(directory + "BattingStats.csv");
        sb = new StringBuilder();
        pitchWriting(directory + "PitchingStats.csv");
    }

    public void setHitterInformation(String[][] hitterInformation){
        this.hitterInformation = hitterInformation;
        for(int i = 0; i < hitterInformation.length; i++){
            try {
                if (!hitterInformation[i][0].equals(null)) {
                    hitIndex++;
                }
            }catch(Exception e){}
        }
    }

    public void setPitcherInformation(String[][] pitcherInformation){
        this.pitcherInformation = pitcherInformation;
        for(int i = 0; i < pitcherInformation.length; i++){
            try {
                if (!pitcherInformation[i][0].equals(null)) {
                    pitchIndex++;
                }
            }catch(Exception e){}
        }
    }

    public void insertInfo(String position, String[] input){
        if (position.equals("pitcher")) {
            pitcherInformation[pitchIndex++] = input;
        }
        else{
            hitterInformation[hitIndex++] = input;
        }
    }

    private void loopHit(){
        for(int i = 0; i < hitterInformation.length; i++){
            for(int j = 0; j < 11; j++){
                try {
                    if (!hitterInformation[i][j].equals(null)) {
                        sb.append(hitterInformation[i][j] + ',');
                    } else {
                        i = hitterInformation.length;
                        j = 11;
                    }
                }catch(Exception e){}
            }
            try {
                if (!hitterInformation[i][0].equals(null)) {
                    sb.append('\n');
                }
            }catch(Exception e){}
        }
    }

    private void loopPitch(){
        for(int i = 0; i < pitcherInformation.length; i++){
            for(int j = 0; j < 12; j++){
                try {
                    if (!pitcherInformation[i][j].equals(null)) {
                        sb.append(pitcherInformation[i][j] + ',');
                    } else {
                        i = pitcherInformation.length;
                        j = 11;
                    }
                }catch(Exception e){}
            }
            try {
                if (!pitcherInformation[i][0].equals(null)) {
                    sb.append('\n');
                }
            } catch (Exception e){}
        }
    }

    private void hitWriting(String name){
        loopHit();
        writing(name);
    }

    private void pitchWriting(String name){
        loopPitch();
        writing(name);
    }

    private void writing(String name) {
        try (PrintWriter writer = new PrintWriter(name)) {
            writer.write(sb.toString());

            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
