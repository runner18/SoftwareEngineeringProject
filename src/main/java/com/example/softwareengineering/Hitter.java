package com.example.softwareengineering;

public class Hitter extends Player
{
    private double statH, stat2B, stat3B, statHR, statBB, statK;

    public Hitter(String playerNumber, String playerPosition, double statH, double stat2B, double stat3B, double statHR, double statBB, double statK) {
        super(playerNumber, playerPosition);
        this.statH = statH;
        this.stat2B = stat2B;
        this.stat3B = stat3B;
        this.statHR = statHR;
        this.statBB = statBB;
        this.statK = statK;
    }
}
