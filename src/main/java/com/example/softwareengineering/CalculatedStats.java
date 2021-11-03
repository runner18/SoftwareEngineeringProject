package com.example.softwareengineering;

//As I understand it, the CalculatedStats are the stats calculated from an individual player, whether that be pitcher or hitter
//I have each player containing a CalculatedStats object, where their stats can be calculated and then fetched
public class CalculatedStats
{
    //where the actual calculations take place, will implement further in the future
    public double calculateAverage(double hits, double atBats)
    {
        return hits / atBats;
    }

    public double calculateOBP(double hits, double walks, double hitByPitch, double atBats)
    {
        return (hits + walks + hitByPitch) / (walks + hitByPitch + atBats);
    }

    public double calculateSLG(double singles, double doubles, double triples, double homeruns, double atBats)
    {
        return ((singles + doubles + triples + homeruns) / atBats);
    }

    public double calculateOPS(double singles, double doubles, double triples, double homeruns, double hits, double walks, double hitByPitch, double atBats)
    {
        return calculateOBP(hits, walks, hitByPitch, atBats) + calculateSLG(singles, doubles, triples, homeruns, atBats);
    }

    public double calculateERA(double earnedRuns, double inningsPitched)
    {
        return earnedRuns / inningsPitched;
    }
}
