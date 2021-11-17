package com.example.softwareengineering;

public class Hitter extends Player
{
    private double statAtBats, statH, stat1B, stat2B, stat3B, statHR, statBB, statK, statHBP, calcAVG, calcOBP, calcOPS, calcSLG;
    private CalculatedStats calculatedStats = new CalculatedStats();

    public Hitter(String playerNumber, String playerPosition, double statAtBats, double statH, double stat1B, double stat2B, double stat3B, double statHR, double statBB, double statK, double statHBP) {
        super(playerNumber, playerPosition);
        this.statAtBats = statAtBats;
        this.statH = statH;
        this.stat1B = stat1B;
        this.stat2B = stat2B;
        this.stat3B = stat3B;
        this.statHR = statHR;
        this.statBB = statBB;
        this.statK = statK;
        this.statHBP = statHBP;
        CalculateStats();
    }

    public void CalculateStats()
    {
        calcAVG = calculatedStats.calculateAverage(statH, statAtBats);
        calcOBP = calculatedStats.calculateOBP(statH, statBB, statHBP, statAtBats);
        calcOPS = calculatedStats.calculateOPS(stat1B, stat2B, stat3B, statHR, statH, statBB, statHBP, statAtBats);
        calcSLG = calculatedStats.calculateSLG(stat1B, stat2B, stat3B, statHR, statAtBats);
    }

    public double getStatAtBats() {
        return statAtBats;
    }

    public void setStatAtBats(double statH) {
        this.statAtBats = statH;
    }

    public double getStatH() {
        return statH;
    }

    public void setStatH(double statH) {
        this.statH = statH;
    }

    public double getStat1B() {
        return stat1B;
    }

    public void setStat1B(double stat1B) {
        this.stat1B = stat1B;
    }

    public double getStat2B() {
        return stat2B;
    }

    public void setStat2B(double stat2B) {
        this.stat2B = stat2B;
    }

    public double getStat3B() {
        return stat3B;
    }

    public void setStat3B(double stat3B) {
        this.stat3B = stat3B;
    }

    public double getStatHR() {
        return statHR;
    }

    public void setStatHR(double statHR) {
        this.statHR = statHR;
    }

    public double getStatBB() {
        return statBB;
    }

    public void setStatBB(double statBB) {
        this.statBB = statBB;
    }

    public double getStatK() {
        return statK;
    }

    public void setStatK(double statK) {
        this.statK = statK;
    }

    public CalculatedStats getCalculatedStats() {
        return calculatedStats;
    }

    public double getCalcAVG(){return calcAVG;}
    public double getCalcOBP(){return calcOBP;}
    public double getCalcOPS(){return calcOPS;}
    public double getCalcSLG(){return calcSLG;}

}