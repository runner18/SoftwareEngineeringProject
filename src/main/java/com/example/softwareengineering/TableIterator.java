package com.example.softwareengineering;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TableIterator {

    private StringBuilder sb = new StringBuilder();//String Builder object for writing to files
    private static String[][] hitterInformation;//An array of all hitter information
    private static String[][] pitcherInformation;//An array of all pitcher information
    private static int hitIndex = 0;//Safety index in the event that null data is found in the array of hitters
    private static int pitchIndex = 0;//Safety index in the event that null data is found in the array of pitchers
    private String directory = "src/main/resources/com/example/softwareengineering/";//The location path of the database files

    /**
     * WriteToFileMethod
     * The public method used to start the saving process for both hitters and pitchers in the proper manner
     */
    public void writeToFile(){
        sb = new StringBuilder();//resets the String Builder object
        hitWriting(directory + "BattingStats.csv");//Calling the hitWriting method using the appropriate location
        sb = new StringBuilder();//resets the String Builder object
        pitchWriting(directory + "PitchingStats.csv");//Calling the pitchWriting method using the appropriate location
    }

    /**
     * ExportFileMethod
     * Returns the full array of batters or pitchers from the database
     * @param location - file directory path as specified by the user
     */
    public void exportFile (String location){
        for(int i = location.length() - 1; i > 0; i--){//Loop through all characters of the string parameter starting from the back
            if(location.charAt(i) == '\\'){//Find the last instance of the \ character
                location = location.substring(0, i);//Use the string with everything up to the last \ character
                i = 0;//exit the loop
            }
        }
        sb = new StringBuilder();//reset the stringBuilder object
        hitWriting(location + "\\BattingStats.csv");//Access the hitWriting method with the new location and what will be the name of the written file
        sb = new StringBuilder();//reset the stringBuilder object
        pitchWriting(location + "\\PitchingStats.csv");//Access the pitchWriting method with the new location and what will be the name of the written file
    }

    /**
     * SetHitterInformationMethod
     * Uses the passed information to set the global static hitterInformation
     * @param hitterInformation - the information on all hitters as passed from the accessing object
     */
    public void setHitterInformation(String[][] hitterInformation){
        this.hitterInformation = hitterInformation;//Setting the global variable to the passed information
        for(int i = 0; i < hitterInformation.length; i++){//looping through the array to find the correct length
            try {//watching for mullInformation errors
                if (!hitterInformation[i][0].equals(null)) {//watching for information that is not the end of the array
                    hitIndex++;//increasing the global variable index of the hitterInformation array
                }
            }catch(Exception e){e.printStackTrace();}//printing out errors found if needed
        }
    }

    /**
     * SetPitcherInformationMethod
     * Uses the passed information to set the global static pitcherInformation
     * @param pitcherInformation - the information on all pitchers as passed from the accessing object
     */
    public void setPitcherInformation(String[][] pitcherInformation){
        this.pitcherInformation = pitcherInformation;//Setting the global variable to the passed information
        for(int i = 0; i < pitcherInformation.length; i++){//looping through the array to find the correct length
            try {//watching for mullInformation errors
                if (!pitcherInformation[i][0].equals(null)) {//watching for information that is not the end of the array
                    pitchIndex++;//increasing the global variable index of the pitcherInformation array
                }
            }catch(Exception e){}
        }
    }

    /**
     * InsertInfoMethod
     * Places a new player into the correct array
     * @param position - the name of the correct array for the player to be placed into
     * @param input - the information about the newly created player
     */
    public void insertInfo(String position, String[] input){
        if (position.equals("pitcher")) {//checking which type of player was created
            pitcherInformation[pitchIndex++] = input;//inserting the new data and increasing the index to match
        }
        else{
            hitterInformation[hitIndex++] = input;//inserting the new data and increasing the index to match
        }
    }

    /**
     * LoopHitMethod
     * Updates the global string builder object to print out all of the hitter information
     */
    private void loopHit(){
        for(int i = 0; i < hitterInformation.length; i++){//iterate through the hitterInformation array
            for(int j = 0; j < 11; j++){//checking for each stat in the second dimension of the hitterInformation array
                try {//checking for nullInformation errors
                    if (!hitterInformation[i][j].equals(null)) {//checking for information in the specific
                        sb.append(hitterInformation[i][j] + ',');//Adding the information to the StringBuilder for use later as well as a comma for separation
                    } else {//Exits the current loop
                        i = hitterInformation.length;
                        j = 11;
                    }
                }catch(Exception e){e.printStackTrace();}//print out any errors if needed
            }
            try {//watching for nullInformation errors
                if (!hitterInformation[i][0].equals(null)) {//Looking for a nonNull point
                    sb.append('\n');//Adding a breakline to the StringBuilder to help format the upcoming printed file
                }
            }catch(Exception e){e.printStackTrace();}//print out any errors if needed
        }
    }

    /**
     * LoopPitchMethod
     * Updates the global string builder object to print out all of the pitcher information
     */
    private void loopPitch(){
        for(int i = 0; i < pitcherInformation.length; i++){//iterate through the pitcherInformation array
            for(int j = 0; j < 12; j++){//checking for each stat in the second dimension of the pitcherInformation array
                try {//checking for nullInformation errors
                    if (!pitcherInformation[i][j].equals(null)) {//checking for information in the specific
                        sb.append(pitcherInformation[i][j] + ',');//Adding the information to the StringBuilder for use later as well as a comma for separation
                    } else {//Exits the current loop
                        i = pitcherInformation.length;
                        j = 11;
                    }
                }catch(Exception e){e.printStackTrace();}//print out any errors if needed
            }
            try {//watching for nullInformation errors
                if (!pitcherInformation[i][0].equals(null)) {//Looking for a nonNull point
                    sb.append('\n');//Adding a breakline to the StringBuilder to help format the upcoming printed file
                }
            } catch (Exception e){e.printStackTrace();}//print out any errors if needed
        }
    }

    /**
     * HitWritingMethod
     * Calls the loopHit and writing methods in a specific order to ensure events happen sequentially
     * @param name - the name of the path to be used in writing the file
     */
    private void hitWriting(String name){
        loopHit();
        writing(name);
    }

    /**
     * PitchWritingMethod
     * Calls the loopPitch and writing methods in a specific order to ensure events happen sequentially
     * @param name - the name of the path to be used in writing the file
     */
    private void pitchWriting(String name){
        loopPitch();
        writing(name);
    }

    /**
     * WritingMethod
     * Uses the given name variable to be able to write a given file in a specific directory in a user's file system
     * @param name - the name of the path to be used in writing the file
     */
    private void writing(String name) {
        try{//watching for any kind of error that may be involved with file writing
            FileWriter file = new FileWriter(name);//creating a new FileWriter object based on the parameter
            try (PrintWriter writer = new PrintWriter(file)) {//Attempting to create a PrintWriter based on the FileWriter
                writer.write(sb.toString());//Using the StringBuilder object to write with the PrintWriter object
            } catch (Exception e) {//catching any found errors
                System.out.println(e.getMessage());//Printing out the message from the error that was found
            }
        }catch(Exception e) {//catching any found errors
            System.out.println(e.getMessage());//Printing out the message from the error that was found
        }
    }
}
