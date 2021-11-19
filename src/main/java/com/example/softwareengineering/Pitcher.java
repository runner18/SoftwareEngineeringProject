/**
 * Softball Statistics Inventory Manager
 * Software to calculate and crunch various softball statistics to streamline the analysis process
 * Pitcher.java - Class to handle overall Pitcher objects and respective statistics
 * Course: Software Engineering
 * Instructor: Dr. Malik
 * Date: November 21, 2021
 * Authors: Thane Class, Alex Diehl, Alex Duke, and Stacey Walters
 */

package com.example.softwareengineering;

public class Pitcher extends Player {
    private double statIP, statW, statL, statCG, statR, statER, statB13, statK, statHR, statH, calcERA; //Initializing statistics variables
    private CalculatedStats calculatedStats = new CalculatedStats();

    /**
     * Pitcher Constructor Method
     * Constructor for Pitcher
     * @param playerNumber - imported player's number
     * @param playerPosition - imported player position
     * @param statIP - imported IP statistic
     * @param statW - imported H statistic
     * @param statL - imported L statistic
     * @param statCG - imported CG statistic
     * @param statR - imported R statistic
     * @param statER - imported ER statistic
     * @param statB13 - imported B13 statistic
     * @param statK -imported K statistic
     * @param statHR -imported HR statistic
     * @param statH - importred H statistic
     */
    public Pitcher(String playerNumber, String playerPosition, double statIP, double statW, double statL, double statCG, double statR, double statER, double statB13, double statK, double statHR, double statH) {
        super(playerNumber, playerPosition); //Super class utilizing number and position
        this.statIP = statIP; //Initializing all statistic variables
        this.statW = statW;
        this.statL = statL;
        this.statCG = statCG;
        this.statR = statR;
        this.statER = statER;
        this.statB13 = statB13;
        this.statK = statK;
        this.statHR = statHR;
        this.statH = statH;
        CalculateStats(); //Call class to calculate relevant statistics
    }

    /**
     * CalculateStats Method
     * Calculate the ERA statistic
     */
    public void CalculateStats() {
        calcERA = calculatedStats.calculateERA(statER, statIP);
    }

    /**
     * GetStatIP Accessor Method
     * Retrieves the IP Statistic
     * @return - IP statistic as a double
     */
    public double getStatIp() {
        return statIP;
    }

    /**
     * SetStatIP Mutator Method
     * Sets the IP statistic to a specified input
     * @param statIP - double variable containing the IP statistic
     */
    public void setStatIp(double statIP) {
        this.statIP = statIP;
    }

    /**
     * GetStatW Accessor Method
     * Retrieves the W Statistic
     * @return - W statistic as a double
     */
    public double getStatW() {
        return statW;
    }

    /**
     * SetStatW Mutator Method
     * Sets the W statistic to a specified input
     * @param statW - double variable containing the W statistic
     */
    public void setStatW(double statW) {
        this.statW = statW;
    }

    /**
     * GetStatL Accessor Method
     * Retrieves the L Statistic
     * @return - L statistic as a double
     */
    public double getStatL() {
        return statL;
    }

    /**
     * SetStatL Mutator Method
     * Sets the L statistic to a specified input
     * @param statL - double variable containing the L statistic
     */
    public void setStatL(double statL) {
        this.statL = statL;
    }

    /**
     * GetStatCG Accessor Method
     * Retrieves the CG Statistic
     * @return - CG statistic as a double
     */
    public double getStatCG() {
        return statCG;
    }

    /**
     * SetStatCG Mutator Method
     * Sets the CG statistic to a specified input
     * @param statCG - double variable containing the CG statistic
     */
    public void setStatCG(double statCG) {
        this.statCG = statCG;
    }

    /**
     * GetStatR Accessor Method
     * Retrieves the R Statistic
     * @return - R statistic as a double
     */
    public double getStatR() {
        return statR;
    }

    /**
     * SetStatR Mutator Method
     * Sets the R statistic to a specified input
     * @param statR - double variable containing the R statistic
     */
    public void setStatR(double statR) {
        this.statR = statR;
    }

    /**
     * GetStatER Accessor Method
     * Retrieves the ER Statistic
     * @return - ER statistic as a double
     */
    public double getStatER() {
        return statER;
    }

    /**
     * SetStatER Mutator Method
     * Sets the ER statistic to a specified input
     * @param statER - double variable containing the ER statistic
     */
    public void setStatER(double statER) {
        this.statER = statER;
    }

    /**
     * GetStatB13 Accessor Method
     * Retrieves the B13 Statistic
     * @return - B13 statistic as a double
     */
    public double getStatB13() {
        return statB13;
    }

    /**
     * SetStatB13 Mutator Method
     * Sets the B13 statistic to a specified input
     * @param statB13 - double variable containing the B13 statistic
     */
    public void setStatB13(double statB13) {
        this.statB13 = statB13;
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

    public CalculatedStats getCalculatedStats() {
        return calculatedStats;
    }

}