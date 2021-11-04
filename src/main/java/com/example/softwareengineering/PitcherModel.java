package com.example.softwareengineering;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class PitcherModel {
    private SimpleStringProperty playerName;
    private SimpleStringProperty position;
    private SimpleDoubleProperty statIP;
    private SimpleDoubleProperty statW;
    private SimpleDoubleProperty statL;
    private SimpleDoubleProperty statCG;
    private SimpleDoubleProperty statR;
    private SimpleDoubleProperty statER;
    private SimpleDoubleProperty statB13;
    private SimpleDoubleProperty statK;
    private SimpleDoubleProperty statHR;
    private SimpleDoubleProperty statH;

    public PitcherModel (Pitcher pitcher){
        playerName = new SimpleStringProperty(pitcher.getPersonName());
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

    public String getPlayerName() {
        return playerName.get();
    }

    public SimpleStringProperty playerNameProperty() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName.set(playerName);
    }

    public String getPosition() {
        return position.get();
    }

    public SimpleStringProperty positionProperty() {
        return position;
    }

    public void setPosition(String position) {
        this.position.set(position);
    }

    public double getStatIP() {
        return statIP.get();
    }

    public SimpleDoubleProperty statIPProperty() {
        return statIP;
    }

    public void setStatIP(double statIP) {
        this.statIP.set(statIP);
    }

    public double getStatW() {
        return statW.get();
    }

    public SimpleDoubleProperty statWProperty() {
        return statW;
    }

    public void setStatW(double statW) {
        this.statW.set(statW);
    }

    public double getStatL() {
        return statL.get();
    }

    public SimpleDoubleProperty statLProperty() {
        return statL;
    }

    public void setStatL(double statL) {
        this.statL.set(statL);
    }

    public double getStatCG() {
        return statCG.get();
    }

    public SimpleDoubleProperty statCGProperty() {
        return statCG;
    }

    public void setStatCG(double statCG) {
        this.statCG.set(statCG);
    }

    public double getStatR() {
        return statR.get();
    }

    public SimpleDoubleProperty statRProperty() {
        return statR;
    }

    public void setStatR(double statR) {
        this.statR.set(statR);
    }

    public double getStatER() {
        return statER.get();
    }

    public SimpleDoubleProperty statERProperty() {
        return statER;
    }

    public void setStatER(double statER) {
        this.statER.set(statER);
    }

    public double getStatB13() {
        return statB13.get();
    }

    public SimpleDoubleProperty statB13Property() {
        return statB13;
    }

    public void setStatB13(double statB13) {
        this.statB13.set(statB13);
    }

    public double getStatK() {
        return statK.get();
    }

    public SimpleDoubleProperty statKProperty() {
        return statK;
    }

    public void setStatK(double statK) {
        this.statK.set(statK);
    }

    public double getStatHR() {
        return statHR.get();
    }

    public SimpleDoubleProperty statHRProperty() {
        return statHR;
    }

    public void setStatHR(double statHR) {
        this.statHR.set(statHR);
    }

    public double getStatH() {
        return statH.get();
    }

    public SimpleDoubleProperty statHProperty() {
        return statH;
    }

    public void setStatH(double statH) {
        this.statH.set(statH);
    }
}
