/**
 * Softball Statistics Inventory Manager
 * Software to calculate and crunch various softball statistics to streamline the analysis process
 * PitcherModel.java - implements a Pitcher's statistics into their object and provides relevant operations
 * Course: Software Engineering
 * Instructor: Dr. Malik
 * Date: November 21, 2021
 * Authors: Thane Class, Alex Diehl, Alex Duke, and Stacey Walters
 */

package com.example.softwareengineering;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class PitcherModel {
    private SimpleStringProperty playerName; //Initializing variables
    private SimpleStringProperty position;
    private SimpleDoubleProperty statIP, statW, statL, statCG, statR, statER, statB13, statK, statHR, statH;

    /**
     * PitcherModel Method
     * Constructor for pitchermodel
     * @param pitcher - specified pitcher object
     */
    public PitcherModel (Pitcher pitcher){
        playerName = new SimpleStringProperty(pitcher.getPersonName()); //Defines all relevant pitcher information
        position = new SimpleStringProperty(pitcher.getPlayerPosition());
        statIP = new SimpleDoubleProperty(pitcher.getStatIp());
        statW = new SimpleDoubleProperty(pitcher.getStatW());
        statL = new SimpleDoubleProperty(pitcher.getStatL());
        statCG = new SimpleDoubleProperty(pitcher.getStatCG());
        statR = new SimpleDoubleProperty(pitcher.getStatR());
        statER = new SimpleDoubleProperty(pitcher.getStatER());
        statB13 = new SimpleDoubleProperty(pitcher.getStatB13());
        statK = new SimpleDoubleProperty(pitcher.getStatK());
        statHR = new SimpleDoubleProperty(pitcher.getStatHR());
        statH = new SimpleDoubleProperty(pitcher.getStatH());
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
     * GetStatIP Accessor Method
     * Retrieve the player's IP statistic
     * @return - player's IP statistic as a double
     */
    public double getStatIP() {
        return statIP.get();
    }

    /**
     * SetStatIP Mutator Method
     * Sets the player's IP statistic to a specified input
     * @param statIP - player IP statistic as a double
     */
    public void setStatIP(double statIP) {
        this.statIP.set(statIP);
    }

    /**
     * GetStatW Accessor Method
     * Retrieve the player's W statistic
     * @return - player's W statistic as a double
     */
    public double getStatW() {
        return statW.get();
    }

    /**
     * SetStatW Mutator Method
     * Sets the player's W statistic to a specified input
     * @param statW - player W statistic as a double
     */
    public void setStatW(double statW) {
        this.statW.set(statW);
    }

    /**
     * GetStatL Accessor Method
     * Retrieve the player's L statistic
     * @return - player's L statistic as a double
     */
    public double getStatL() {
        return statL.get();
    }

    /**
     * SetStatL Mutator Method
     * Sets the player's L statistic to a specified input
     * @param statL - player L statistic as a double
     */
    public void setStatL(double statL) {
        this.statL.set(statL);
    }

    /**
     * GetStatCG Accessor Method
     * Retrieve the player's CG statistic
     * @return - player's CG statistic as a double
     */
    public double getStatCG() {
        return statCG.get();
    }


    /**
     * SetStatCG Accessor Method
     * Retrieve the player's CG statistic
     * @return - player's CG statistic as a double
     */
    public void setStatCG(double statCG) {
        this.statCG.set(statCG);
    }

    /**
     * GetStatR Accessor Method
     * Retrieve the player's R statistic
     * @return - player's R statistic as a double
     */
    public double getStatR() {
        return statR.get();
    }

    /**
     * SetStatR Mutator Method
     * Sets the player's R statistic to a specified input
     * @param statR - player R statistic as a double
     */
    public void setStatR(double statR) {
        this.statR.set(statR);
    }

    /**
     * GetStatER Accessor Method
     * Retrieve the player's ER statistic
     * @return - player's ER statistic as a double
     */
    public double getStatER() {
        return statER.get();
    }

    /**
     * SetStatER Mutator Method
     * Sets the player's ER statistic to a specified input
     * @param statER - player ER statistic as a double
     */
    public void setStatER(double statER) {
        this.statER.set(statER);
    }

    /**
     * GetStatB13 Accessor Method
     * Retrieve the player's B13 statistic
     * @return - player's B13 statistic as a double
     */
    public double getStatB13() {
        return statB13.get();
    }

    /**
     * SetStatB13 Mutator Method
     * Sets the player's B13 statistic to a specified input
     * @param statB13 - player B13 statistic as a double
     */
    public void setStatB13(double statB13) {
        this.statB13.set(statB13);
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
}
