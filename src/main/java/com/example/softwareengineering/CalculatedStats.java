package com.example.softwareengineering;

//As I understand it, the CalculatedStats are the stats calculated from an individual player, whether that be pitcher or hitter
//I have each player containing a CalculatedStats object, where their stats can be calculated and then fetched
public class CalculatedStats
{
    double statAverage, statOBP, statSLG, statOPS, statERA;

    public double getStatAverage() {
        return statAverage;
    }

    public void setStatAverage(double statAverage) {
        this.statAverage = statAverage;
    }

    public double getStatOBP() {
        return statOBP;
    }

    public void setStatOBP(double statOBP) {
        this.statOBP = statOBP;
    }

    public double getStatSLG() {
        return statSLG;
    }

    public void setStatSLG(double statSLG) {
        this.statSLG = statSLG;
    }

    public double getStatOPS() {
        return statOPS;
    }

    public void setStatOPS(double statOPS) {
        this.statOPS = statOPS;
    }

    public double getStatERA() {
        return statERA;
    }

    public void setStatERA(double statERA) {
        this.statERA = statERA;
    }

    //where the actual calculations take place, will implement further in the future
    public void calculateAverage()
    {

    }

    public void calculateOBP()
    {

    }

    public void calculateSLG()
    {

    }

    public void calculateOPS()
    {

    }
}
