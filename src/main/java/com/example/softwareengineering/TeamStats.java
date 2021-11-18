/**
 * Softball Statistics Inventory Manager
 * Software to calculate and crunch various softball statistics to streamline the analysis process
 * TeamStats.java - Calculates the average of all players within a single teama (reserved for future implementation)
 * Course: Software Engineering
 * Instructor: Dr. Malik
 * Date: November 21, 2021
 * Authors: Thane Class, Alex Diehl, Alex Duke, and Stacey Walters
 */

package com.example.softwareengineering;

import java.util.ArrayList;
import java.util.List;

public class TeamStats {
    private double avgAverage, avgOBP, avgSLG, avgOPS, avgERA;  //Initializing all variable averages
    List<Person> players = new ArrayList<Person>(); //Initializing arraylist for all players within a team

    /**
     * GetAverageAVG Accessor Method
     * Retrieves the team average AVG
     * @return - team's AVG average as a double
     */
    public double getAvgAverage() {
        return avgAverage;
    }

    /**
     * GetAverageOBP Accessor Method
     * Retrieves the team average OBP
     * @return - team's OBP average as a double
     */
    public double getAvgOBP() {
        return avgOBP;
    }

    /**
     * GetAverageSLG Accessor Method
     * Retrieves the team average SLG
     * @return - team's SLG average as a double
     */
    public double getAvgSLG() {
        return avgSLG;
    }

    /**
     * GetAverageOPS Accessor Method
     * Retrieves the team average OPS
     * @return - team's OPS average as a double
     */
    public double getAvgOPS() {
        return avgOPS;
    }

    /**
     * GetAverageERA Accessor Method
     * Retrieves the team average ERA
     * @return - team's ERA average as a double
     */
    public double getAvgERA() {
        return avgERA;
    }

    /**
     * SetPlayers Mutator Method
     * Inputs the arraylist for all players within a team
     * @param players - input arraylist for all players within a team, as a Person list
     */
    public void setPlayers(List<Person> players) {
        this.players = players;
    }

    /**
     * CalculateAverageAVG Method
     * Calculates the average AVG of the team (Reserved for future implementation)
     * @return - average value of team's AVG
     */
    public double calculateAvgAverage() {
        double temp = 0;
        for (int i = 0; i < players.size(); i++) {  //Iterates through the players on a team and averages stat
            System.out.println("[DEBUG: Calculate Team AVG]: The subsystem incrementing correctly. Index = " + i + ".");
        }
        return (temp/players.size());   //Total AVG/n Players
    }

    /**
     * CalculateAverageOBP Method
     * Calculates the average OBP of the team (Reserved for future implementation)
     * @return - average value of team's OBP
     */
    public double calculateAvgOBP() {
        double temp = 0;
        for (int i = 0; i < players.size(); i++) {  //Iterates through the players on a team and averages stat
            System.out.println("[DEBUG: Calculate Team OBP]: The subsystem incrementing correctly. Index = " + i + ".");
        }
        return (temp/players.size());    //Total OBP/n Players
    }

    /**
     * CalculateAverageOPS Method
     * Calculates the average OPS of the team (Reserved for future implementation)
     * @return - average value of team's OPS
     */
    public double calculateAvgOPS() {
        int temp = 0;
        for (int i = 0; i < players.size(); i++) {  //Iterates through the players on a team and averages stat
            System.out.println("[DEBUG: Calculate Team OPS]: The subsystem incrementing correctly. Index = " + i + ".");
        }
        return (temp/players.size()); //Total OPS/n Players
    }
}
