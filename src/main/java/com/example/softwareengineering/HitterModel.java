/**
 * Softball Statistics Inventory Manager
 * Software to calculate and crunch various softball statistics to streamline the analysis process
 * HitterModel.java - implements a Pitcher's statistics into their object and provides relevant operations
 * Course: Software Engineering
 * Instructor: Dr. Malik
 * Date: November 21, 2021
 * Authors: Thane Class, Alex Diehl, Alex Duke, and Stacey Walters
 */

package com.example.softwareengineering;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class HitterModel {
    private SimpleStringProperty playerName; //Initializing variables
    private SimpleStringProperty position;
    private SimpleDoubleProperty statAtBats, statH, stat1B, stat2B, stat3B, statHR, statBB, statK, statAVG, statOBP, statOPS, statSLG;

    /**
     * HitterModel Method
     * Constructor for hittermodel
     * @param hitter - specified hitter object
     */
    public HitterModel(Hitter hitter) {
        playerName = new SimpleStringProperty(hitter.getPersonName()); //Defines all relevant pitcher information
        position = new SimpleStringProperty(hitter.getPlayerPosition());
        statAtBats = new SimpleDoubleProperty(hitter.getStatAtBats());
        statH = new SimpleDoubleProperty(hitter.getStatH());
        stat1B = new SimpleDoubleProperty(hitter.getStat1B());
        stat2B = new SimpleDoubleProperty(hitter.getStat2B());
        stat3B = new SimpleDoubleProperty(hitter.getStat3B());
        statHR = new SimpleDoubleProperty(hitter.getStatHR());
        statBB = new SimpleDoubleProperty(hitter.getStatBB());
        statK = new SimpleDoubleProperty(hitter.getStatK());
        statAVG = new SimpleDoubleProperty(hitter.getCalcAVG());
        statOBP = new SimpleDoubleProperty(hitter.getCalcOBP());
        statOPS = new SimpleDoubleProperty(hitter.getCalcOPS());
        statSLG = new SimpleDoubleProperty(hitter.getCalcSLG());

    }

    /**
     * GetPlayerName Accessor Method
     * Retrieve the player's name
     * @return - player's name as a string
     */
    public String getPlayerName() {
        return playerName.get();
    }

    /**
     * SetPlayerName Mutator Method
     * Sets the player name to a specified input
     * @param playerName - player name as a String
     */
    public void setPlayerName(String playerName) {
        this.playerName.set(playerName);
    }

    /**
     * GetPosition Accessor Method
     * Retrieve the player's position
     * @return - player's position as a string
     */
    public String getPosition() {
        return position.get();
    }

    /**
     * SetPosition Mutator Method
     * Sets the player position to a specified input
     * @param position - player position as a String
     */
    public void setPosition(String position) {
        this.position.set(position);
    }

    /**
     * GetStatAtBats Accessor Method
     * Retrieve the player's AtBats statistic
     * @return - player's AtBats statistic as a double
     */
    public double getStatAtBats() {
        return statAtBats.get();
    }

    /**
     * SetStatAtBats Mutator Method
     * Sets the player's AtBats statistic to a specified input
     * @param statAtBats - player AtBats statistic as a double
     */
    public void setStatAtBats(double statAtBats) {
        this.statAtBats.set(statAtBats);
    }
    
    /**
     * GetStatH Accessor Method
     * Retrieve the player's H statistic
     * @return - player's H statistic as a double
     */
    public double getStatH() {
        return statH.get();
    }

    /**
     * SetStatH Mutator Method
     * Sets the player's H statistic to a specified input
     * @param statH - player H statistic as a double
     */
    public void setStatH(double statH) {
        this.statH.set(statH);
    }
    
    /**
     * GetStat1B Accessor Method
     * Retrieve the player's 1B statistic
     * @return - player's 1B statistic as a double
     */
    public double getStat1B() {
        return stat1B.get();
    }

    /**
     * SetStat1B Mutator Method
     * Sets the player's 1B statistic to a specified input
     * @param stat1B - player 1B statistic as a double
     */
    public void setStat1B(double stat1B) {
        this.stat1B.set(stat1B);
    }
    
    /**
     * GetStat2B Accessor Method
     * Retrieve the player's 2B statistic
     * @return - player's 2B statistic as a double
     */
    public double getStat2B() {
        return stat2B.get();
    }

    /**
     * SetStat2B Mutator Method
     * Sets the player's 2B statistic to a specified input
     * @param stat2B - player 2B statistic as a double
     */
    public void setStat2B(double stat2B) {
        this.stat2B.set(stat2B);
    }
    
    /**
     * GetStat3B Accessor Method
     * Retrieve the player's 3B statistic
     * @return - player's 3B statistic as a double
     */
    public double getStat3B() {
        return stat3B.get();
    }

    /**
     * SetStat3B Mutator Method
     * Sets the player's 3B statistic to a specified input
     * @param stat3B - player 3B statistic as a double
     */
    public void setStat3B(double stat3B) {
        this.stat3B.set(stat3B);
    }
    
    /**
     * GetStatHR Accessor Method
     * Retrieve the player's HR statistic
     * @return - player's HR statistic as a double
     */
    public double getStatHR() {
        return statHR.get();
    }

    /**
     * SetStatHR Mutator Method
     * Sets the player's HR statistic to a specified input
     * @param statHR - player HR statistic as a double
     */
    public void setStatHR(double statHR) {
        this.statHR.set(statHR);
    }
    
    /**
     * GetStatBB Accessor Method
     * Retrieve the player's BB statistic
     * @return - player's BB statistic as a double
     */
    public double getStatBB() {
        return statBB.get();
    }

    /**
     * SetStatBB Mutator Method
     * Sets the player's BB statistic to a specified input
     * @param statBB - player BB statistic as a double
     */
    public void setStatBB(double statBB) {
        this.statBB.set(statBB);
    }
    
    /**
     * GetStatK Accessor Method
     * Retrieve the player's K statistic
     * @return - player's K statistic as a double
     */
    public double getStatK() {
        return statK.get();
    }

    /**
     * SetStatK Mutator Method
     * Sets the player's K statistic to a specified input
     * @param statK - player K statistic as a double
     */
    public void setStatK(double statK) {
        this.statK.set(statK);
    }
    
    /**
     * GetStatAVG Accessor Method
     * Retrieve the player's AVG statistic
     * @return - player's AVG statistic as a double
     */
    public double getStatAVG() {
        return statAVG.get();
    }

    /**
     * SetStatAVG Mutator Method
     * Sets the player's AVG statistic to a specified input
     * @param statAVG - player AVG statistic as a double
     */
    public void setStatAVG(double statAVG) {
        this.statAVG.set(statAVG);
    }
    
    /**
     * GetStatOBP Accessor Method
     * Retrieve the player's OBP statistic
     * @return - player's OBP statistic as a double
     */
    public double getStatOBP() {
        return statOBP.get();
    }
    
    /**
     * SetStatOBP Mutator Method
     * Sets the player's OBP statistic to a specified input
     * @param statOBP - player OBP statistic as a double
     */
    public void setStatOBP(double statOBP) {
        this.statOBP.set(statOBP);
    }
    
    /**
     * GetStatOPS Accessor Method
     * Retrieve the player's OPS statistic
     * @return - player's OPS statistic as a double
     */
    public double getStatOPS() {
        return statOPS.get();
    }
    
    /**
     * SetStatOPS Mutator Method
     * Sets the player's OPS statistic to a specified input
     * @param statOPS - player OPS statistic as a double
     */
    public void setStatOPS(double statOPS) {
        this.statOPS.set(statOPS);
    }
    
    /**
     * GetStatSLG Accessor Method
     * Retrieve the player's SLG statistic
     * @return - player's SLG statistic as a double
     */
    public double getStatSLG() {
        return statSLG.get();
    }
    
    /**
     * SetStatSLG Mutator Method
     * Sets the player's SLG statistic to a specified input
     * @param statSLG - player SLG statistic as a double
     */
    public void setStatSLG(double statSLG) {
        this.statSLG.set(statSLG);
    }
}

