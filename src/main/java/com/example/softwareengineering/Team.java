/**
 * Softball Statistics Inventory Manager
 * Software to calculate and crunch various softball statistics to streamline the analysis process
 * Team.java - Implements Team interface, serving as a parent to Person class
 * Course: Software Engineering
 * Instructor: Dr. Malik
 * Date: November 21, 2021
 * Authors: Thane Class, Alex Diehl, Alex Duke, and Stacey Walters
 */

package com.example.softwareengineering;
import java.util.*;

/**
 * Team Class
 * A class meant to represent a physical team, relationship with Person
 */
public class Team {
    private String name, coachName; //Initializations
    private int teamSize;
    private TeamStats teamStats;
    List<Person> players = new ArrayList<Person>(); //Array of all players within a given team

    /**
     * Team Constructor Method
     * Default constructor for class
     * @param name - player name
     * @param coachName - coach's name
     * @param teamSize - size of team represented as an integer
     * @param teamStats - various team statistics, represented in TeamStats object
     */
    public Team(String name, String coachName, int teamSize, TeamStats teamStats) { //Constructor for class
        this.name = name;
        this.coachName = coachName;
        this.teamSize = teamSize;
        this.teamStats = teamStats;
    }

    /**
     * AddHitter Method
     * Adds a hitter to the players array
     * @param hitter - object representing a hitter being added
     */
    public void addHitter(Hitter hitter)
    {
        players.add(hitter);
    }

    /**
     * AddPitcher Method
     * Adds a pitcher to the players array
     * @param pitcher - object representing a pitcher being added
     */
    public void addPitcher(Pitcher pitcher)
    {
        players.add(pitcher);
    }

    /**
     * Team Name Accessor
     * Accesses the name of a specific team
     * @return - name of the team
     */
    public String getName() {
        return name;
    }

    /**
     * Coach Name Accessor
     * Accesses the name of a specific coach (resereved for future implementation)
     * @return - name of the coach
     */
    public String getCoachName() {
        return coachName;
    }

    /**
     * Team Size Accessor
     * Accesses the size of a specific team
     * @return - size of the team, as an integer
     */
    public int getTeamSize() {
        return players.size();
    }

    /**
     * Team Statistics Accessor
     * Accesses the statistics of a specific team
     * @return - statistics of the team
     */
    public TeamStats getTeamStats() {
        return teamStats;
    }

    /**
     * Team Name Mutator
     * Modifies the name of a specific team
     * @param name - desired name of specific team
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Coach Name Mutator
     * Modifies the name of a specific coach
     * @param coachName - desired name of specific coach
     */
    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    /**
     * Team Statistics Calculator
     * Calculates statistics of a specific team (reserved for future implementation)
     */
    public void calculateTeamStats() {
        teamStats.setPlayers(players);  //Calculates statistics from a given array of players
    }
}
