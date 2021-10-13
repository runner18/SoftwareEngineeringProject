package com.example.softwareengineering;

import java.util.ArrayList;
import java.util.List;

//As I understand it, the team stats are the stats from all the players in a team combined
public class TeamStats {
    private double avgAverage, avgOBP, avgSLG, avgOPS, avgERA;

    List<Person> players = new ArrayList<Person>();

    public double getAvgAverage()
    {
        return avgAverage;
    }

    public double getAvgOBP()
    {
        return avgOBP;
    }

    public double getAvgSLG()
    {
        return avgSLG;
    }

    public double getAvgOPS()
    {
        return avgOPS;
    }

    public double getAvgERA()
    {
        return avgERA;
    }

    public void setPlayers(List<Person> players)
    {
        this.players = players;
    }

    //actual team stats will be added in later
    public void calculateAvgAverage()
    {

    }

    public void calculateAvgOBP()
    {

    }

    public void calculateAvgOPS()
    {

    }


}
