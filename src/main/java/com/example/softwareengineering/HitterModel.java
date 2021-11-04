package com.example.softwareengineering;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class HitterModel {
    private SimpleStringProperty playerName;
    private SimpleStringProperty position;
    private SimpleDoubleProperty statAtBats;
    private SimpleDoubleProperty statH;
    private SimpleDoubleProperty stat1B;
    private SimpleDoubleProperty stat2B;
    private SimpleDoubleProperty stat3B;
    private SimpleDoubleProperty statHR;
    private SimpleDoubleProperty statBB;
    private SimpleDoubleProperty statK;
    private SimpleDoubleProperty statAVG;
    private SimpleDoubleProperty statOBP;
    private SimpleDoubleProperty statOPS;
    private SimpleDoubleProperty statSLG;

    public HitterModel(Hitter hitter) {
        playerName = new SimpleStringProperty(hitter.getPersonName());
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

    public double getStatAtBats() {
        return statAtBats.get();
    }

    public SimpleDoubleProperty statAtBatsProperty() {
        return statAtBats;
    }

    public void setStatAtBats(double statAtBats) {
        this.statAtBats.set(statAtBats);
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

    public double getStat1B() {
        return stat1B.get();
    }

    public SimpleDoubleProperty stat1BProperty() {
        return stat1B;
    }

    public void setStat1B(double stat1B) {
        this.stat1B.set(stat1B);
    }

    public double getStat2B() {
        return stat2B.get();
    }

    public SimpleDoubleProperty stat2BProperty() {
        return stat2B;
    }

    public void setStat2B(double stat2B) {
        this.stat2B.set(stat2B);
    }

    public double getStat3B() {
        return stat3B.get();
    }

    public SimpleDoubleProperty stat3BProperty() {
        return stat3B;
    }

    public void setStat3B(double stat3B) {
        this.stat3B.set(stat3B);
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

    public double getStatBB() {
        return statBB.get();
    }

    public SimpleDoubleProperty statBBProperty() {
        return statBB;
    }

    public void setStatBB(double statBB) {
        this.statBB.set(statBB);
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

    public double getStatAVG() {
        return statAVG.get();
    }

    public SimpleDoubleProperty statAVGProperty() {
        return statAVG;
    }

    public void setStatAVG(double statAVG) {
        this.statAVG.set(statAVG);
    }

    public double getStatOBP() {
        return statOBP.get();
    }

    public SimpleDoubleProperty statOBPProperty() {
        return statOBP;
    }

    public void setStatOBP(double statOBP) {
        this.statOBP.set(statOBP);
    }

    public double getStatOPS() {
        return statOPS.get();
    }

    public SimpleDoubleProperty statOPSProperty() {
        return statOPS;
    }

    public void setStatOPS(double statOPS) {
        this.statOPS.set(statOPS);
    }

    public double getStatSLG() {
        return statSLG.get();
    }

    public SimpleDoubleProperty statSLGProperty() {
        return statSLG;
    }

    public void setStatSLG(double statSLG) {
        this.statSLG.set(statSLG);
    }
}

