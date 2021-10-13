package com.example.softwareengineering;

public class Pitcher extends Player{
    private double statIp, statW, statL, statCG, statR, statER, statB13, statK, statHR, statH;

    public Pitcher(String playerNumber, String playerPosition, double statIp, double statW, double statL, double statCG, double statR, double statER, double statB13, double statK, double statHR, double statH) {
        super(playerNumber, playerPosition);
        this.statIp = statIp;
        this.statW = statW;
        this.statL = statL;
        this.statCG = statCG;
        this.statR = statR;
        this.statER = statER;
        this.statB13 = statB13;
        this.statK = statK;
        this.statHR = statHR;
        this.statH = statH;
    }
}
