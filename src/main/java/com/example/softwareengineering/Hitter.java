/**
 * Softball Statistics Inventory Manager
 * Software to calculate and crunch various softball statistics to streamline the analysis process
 * Hitter.java - Class to handle overall Hitter objects and respective statistics
 * Course: Software Engineering
 * Instructor: Dr. Malik
 * Date: November 21, 2021
 * Authors: Thane Class, Alex Diehl, Alex Duke, and Stacey Walters
 */
package com.example.softwareengineering;

public class Hitter extends Player {
    private double statAtBats, statH, stat1B, stat2B, stat3B, statHR, statBB, statK, statHBP, calcAVG, calcOBP, calcOPS, calcSLG; //Initializing statistics variables
    private CalculatedStats calculatedStats = new CalculatedStats();

    /**
     * Hitter Constructor Method
     * Constructor for Hitter
     * @param playerNumber - imported player's number
     * @param playerPosition - imported player position
     * @param statAtBats - imported AtBats statistic
     * @param statH - imported H statistic
     * @param stat1B - imported 1B statistic
     * @param stat2B - imported 2B statistic
     * @param stat3B - imported 3B statistic
     * @param statHR - imported HR statistic
     * @param statBB - imported BB statistic
     * @param statK - imported K statistic
     * @param statHBP - imported HBP statistic
     */
    public Hitter(String playerNumber, String playerPosition, double statAtBats, double statH, double stat1B, double stat2B, double stat3B, double statHR, double statBB, double statK, double statHBP) {
        super(playerNumber, playerPosition); //Super class utilizing number and position
        this.statAtBats = statAtBats; //Initializing all statistic variables
        this.statH = statH;
        this.stat1B = stat1B;
        this.stat2B = stat2B;
        this.stat3B = stat3B;
        this.statHR = statHR;
        this.statBB = statBB;
        this.statK = statK;
        this.statHBP = statHBP;
        CalculateStats(); //Call class to calculate relevant statistics
    }

    /**
     * CalculateStats Method
     * Calculate the statistics of AVG, OBP, OPS, and SLG
     */
    public void CalculateStats() {
        calcAVG = calculatedStats.calculateAverage(statH, statAtBats);
        calcOBP = calculatedStats.calculateOBP(statH, statBB, statHBP, statAtBats);
        calcOPS = calculatedStats.calculateOPS(stat1B, stat2B, stat3B, statHR, statH, statBB, statHBP, statAtBats);
        calcSLG = calculatedStats.calculateSLG(stat1B, stat2B, stat3B, statHR, statAtBats);
    }

    /**
     * GetStatAtBats Accessor Method
     * Retrieves the AtBats Statistic
     * @return - AtBats statistic as a double
     */
    public double getStatAtBats() {
        return statAtBats;
    }

    /**
     * SetStatAtBats Mutator Method
     * Sets the AtBats statistic to a specified input
     * @param statAtBats - double variable containing the AtBats statistic
     */
    public void setStatAtBats(double statAtBats) {
        this.statAtBats = statAtBats;
    }

    /**
     * GetStatH Accessor Method
     * Retrieves the H Statistic
     * @return - H statistic as a double
     */
    public double getStatH() {
        return statH;
    }

    /**
     * SetStatH Mutator Method
     * Sets the H statistic to a specified input
     * @param statH - double variable containing the H statistic
     */
    public void setStatH(double statH) {
        this.statH = statH;
    }

    /**
     * GetStat1B Accessor Method
     * Retrieves the 1B Statistic
     * @return - 1B statistic as a double
     */
    public double getStat1B() {
        return stat1B;
    }

    /**
     * SetStat1B Mutator Method
     * Sets the 1B statistic to a specified input
     * @param stat1B - double variable containing the 1B statistic
     */
    public void setStat1B(double stat1B) {
        this.stat1B = stat1B;
    }

    /**
     * GetStat2B Accessor Method
     * Retrieves the 2B Statistic
     * @return - 2B statistic as a double
     */
    public double getStat2B() {
        return stat2B;
    }

    /**
     * SetStat2B Mutator Method
     * Sets the 2B statistic to a specified input
     * @param stat2B - double variable containing the 2B statistic
     */
    public void setStat2B(double stat2B) {
        this.stat2B = stat2B;
    }

    /**
     * GetStat3B Accessor Method
     * Retrieves the 3B Statistic
     * @return - 3B statistic as a double
     */
    public double getStat3B() {
        return stat3B;
    }

    /**
     * SetStat3B Mutator Method
     * Sets the 3B statistic to a specified input
     * @param stat3B - double variable containing the 3B statistic
     */
    public void setStat3B(double stat3B) {
        this.stat3B = stat3B;
    }

    /**
     * GetStatHR Accessor Method
     * Retrieves the HR Statistic
     * @return - HR statistic as a double
     */
    public double getStatHR() {
        return statHR;
    }

    /**
     * SetStatHR Mutator Method
     * Sets the HR statistic to a specified input
     * @param statHR - double variable containing the HR statistic
     */
    public void setStatHR(double statHR) {
        this.statHR = statHR;
    }

    /**
     * GetStatBB Accessor Method
     * Retrieves the BB Statistic
     * @return - BB statistic as a double
     */
    public double getStatBB() {
        return statBB;
    }

    /**
     * SetStatBB Mutator Method
     * Sets the BB statistic to a specified input
     * @param statBB - double variable containing the BB statistic
     */
    public void setStatBB(double statBB) {
        this.statBB = statBB;
    }

    /**
     * GetStatK Accessor Method
     * Retrieves the K Statistic
     * @return - K statistic as a double
     */
    public double getStatK() {
        return statK;
    }

    /**
     * SetStatK Mutator Method
     * Sets the K statistic to a specified input
     * @param statK - double variable containing the K statistic
     */
    public void setStatK(double statK) {
        this.statK = statK;
    }

    /**
     * GetCalculatedStats Accessor Method
     * Retrieves the calculatedStatistics object
     * @return - CalculatedStats object containing all of the statistics
     */
    public CalculatedStats getCalculatedStats() {
        return calculatedStats;
    }

    /**
     * GetCalcAVG Accessor Method
     * Retrieves the calculate AVG Statistic
     * @return - calculate AVG statistic  as a double
     */
    public double getCalcAVG() {
        return calcAVG;
    }

    /**
     * GetCalcOBP Accessor Method
     * Retrieves the calculate OBP Statistic
     * @return - calculate OBP statistic as a double
     */
    public double getCalcOBP() {
        return calcOBP;
    }
    
    /**
     * GetCalcOPS Accessor Method
     * Retrieves the calculate OPS Statistic
     * @return - calculate OPS statistic  as a double
     */
    public double getCalcOPS() {
        return calcOPS;
    }

    /**
     * GetCalcSLG Accessor Method
     * Retrieves the calculate SLG Statistic
     * @return - calculate SLG statistic  as a double
     */
    public double getCalcSLG() {
        return calcSLG;
    }

}