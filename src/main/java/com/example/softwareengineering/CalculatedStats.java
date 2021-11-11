package com.example.softwareengineering;

import static java.lang.Math.round;

//As I understand it, the CalculatedStats are the stats calculated from an individual player, whether that be pitcher or hitter
//I have each player containing a CalculatedStats object, where their stats can be calculated and then fetched
public class CalculatedStats
{
    //where the actual calculations take place, will implement further in the future
    public double calculateAverage(double hits, double atBats)
    {
        return Math.round((hits / atBats) * 1000.0) / 1000.0;
    }

    public double calculateOBP(double hits, double walks, double hitByPitch, double atBats)
    {
        return Math.round(((hits + walks + hitByPitch) / (walks + hitByPitch + atBats)) * 1000.0) / 1000.0;
    }

    public double calculateSLG(double singles, double doubles, double triples, double homeruns, double atBats)
    {
        return Math.round(((singles + doubles + triples + homeruns) / atBats) * 1000.0) / 1000.0;
    }

    public double calculateOPS(double singles, double doubles, double triples, double homeruns, double hits, double walks, double hitByPitch, double atBats)
    {
        return Math.round(calculateOBP(hits, walks, hitByPitch, atBats) + calculateSLG(singles, doubles, triples, homeruns, atBats) * 1000.0) / 1000.0;
    }

    public double calculateERA(double earnedRuns, double inningsPitched)
    {
        return Math.round((earnedRuns / inningsPitched) * 1000.0) / 1000.0;
    }
}
