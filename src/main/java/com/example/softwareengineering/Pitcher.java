package com.example.softwareengineering;

public class Pitcher extends Player{
    private double statIP, statW, statL, statCG, statR, statER, statB13, statK, statHR, statH, calcERA;
    private CalculatedStats calculatedStats = new CalculatedStats();

    public Pitcher(String playerNumber, String playerPosition, double statIP, double statW, double statL, double statCG, double statR, double statER, double statB13, double statK, double statHR, double statH) {
        super(playerNumber, playerPosition);
        this.statIP = statIP;
        this.statW = statW;
        this.statL = statL;
        this.statCG = statCG;
        this.statR = statR;
        this.statER = statER;
        this.statB13 = statB13;
        this.statK = statK;
        this.statHR = statHR;
        this.statH = statH;
        CalculateStats();
    }

    public void CalculateStats()
    {
        calcERA = calculatedStats.calculateERA(statER, statIP);
    }

    public double getStatIp() {
        return statIP;
    }

    public void setStatIp(double statIP) {
        this.statIP = statIP;
    }

    public double getStatW() {
        return statW;
    }

    public void setStatW(double statW) {
        this.statW = statW;
    }

    public double getStatL() {
        return statL;
    }

    public void setStatL(double statL) {
        this.statL = statL;
    }

    public double getStatCG() {
        return statCG;
    }

    public void setStatCG(double statCG) {
        this.statCG = statCG;
    }

    public double getStatR() {
        return statR;
    }

    public void setStatR(double statR) {
        this.statR = statR;
    }

    public double getStatER() {
        return statER;
    }

    public void setStatER(double statER) {
        this.statER = statER;
    }

    public double getStatB13() {
        return statB13;
    }

    public void setStatB13(double statB13) {
        this.statB13 = statB13;
    }

    public double getStatK() {
        return statK;
    }

    public void setStatK(double statK) {
        this.statK = statK;
    }

    public double getStatHR() {
        return statHR;
    }

    public void setStatHR(double statHR) {
        this.statHR = statHR;
    }

    public double getStatH() {
        return statH;
    }

    public void setStatH(double statH) {
        this.statH = statH;
    }

    public CalculatedStats getCalculatedStats() {
        return calculatedStats;
    }

    //public void setCalculatedStats(CalculatedStats calculatedStats) {
        //this.calculatedStats = calculatedStats;
    //}
}