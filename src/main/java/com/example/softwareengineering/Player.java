/**
 * Softball Statistics Inventory Manager
 * Software to calculate and crunch various softball statistics to streamline the analysis process
 * Player.java - interface to define various generalized information regarding player in database
 * Course: Software Engineering
 * Instructor: Dr. Malik
 * Date: November 21, 2021
 * Authors: Thane Class, Alex Diehl, Alex Duke, and Stacey Walters
 */

package com.example.softwareengineering;

abstract class Player extends Person {
    protected String playerNumber, playerPosition;  //Initializing variables

    /**
     * Player Constructor
     * Constructor for the Player class
     * @param playerNumber - specific player's number
     * @param playerPosition - specific player's position
     */
    public Player(String playerNumber, String playerPosition) {
        this.playerNumber = playerNumber;
        this.playerPosition = playerPosition;
    }

    /**
     * GetPlayerNumber Accessor Method
     * Retrieves a player's number
     * @return - player's number as a String
     */
    public String getPlayerNumber() {
        return playerNumber;
    }

    /**
     * GetPlayerNumber Mutator Method
     * Sets a player's number to the specified input
     * @param playerNumber - player's number as a String
     */
    public void setPlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
    }

    /**
     * GetPlayerPosition Accessor Method
     * Retrieves a player's position
     * @return - player's position as a String
     */
    public String getPlayerPosition() {
        return playerPosition;
    }

    /**
     * GetPlayerPosition Mutator Method
     * Sets a player's position to the specified input
     * @param playerPosition - player's position as a String
     */
    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }
}
