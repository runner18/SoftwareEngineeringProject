package com.example.softwareengineering;

public class Hitter extends Player
{
    private double statH, stat2B, stat3B, statHR, statBB, statK;
    private CalculatedStats calculatedStats;

    public Hitter(String playerNumber, String playerPosition, double statH, double stat2B, double stat3B, double statHR, double statBB, double statK) {
        super(playerNumber, playerPosition);
        this.statH = statH;
        this.stat2B = stat2B;
        this.stat3B = stat3B;
        this.statHR = statHR;
        this.statBB = statBB;
        this.statK = statK;
    }

    public void CalculateStats()
    {
        calculatedStats.calculateAverage();
        calculatedStats.calculateOBP();
        calculatedStats.calculateOPS();
        calculatedStats.calculateSLG();
    }

    public double getStatH() {
        return statH;
    }

    public void setStatH(double statH) {
        this.statH = statH;
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

    public void setCalculatedStats(CalculatedStats calculatedStats) {
        this.calculatedStats = calculatedStats;
    }
}
