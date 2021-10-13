package com.example.softwareengineering;
import java.util.*;

public class Team {
    private String name, captainName, coachName;
    private int teamSize;
    private TeamStats teamStats;
    List<Person> players = new ArrayList<Person>(); // a list of all the players on the team, can be added to

    private double avgAverage, avgOBP, avgSLG, avgOPS, avgERA;


    public Team(String name, String captainName, String coachName, int teamSize, TeamStats teamStats)
    {
        this.name = name;
        this.captainName = captainName;
        this.coachName = coachName;
        this.teamSize = teamSize;
        this.teamStats = teamStats;
    }

    public void addHitter(Hitter hitter)
    {
        players.add(hitter);
    }

    public void addPitcher(Pitcher pitcher)
    {
        players.add(pitcher);
    }

    public String getName() {
        return name;
    }

    public String getCaptainName() {
        return captainName;
    }

    public String getCoachName() {
        return coachName;
    }

    public int getTeamSize() {
        return players.size();
    }

    public TeamStats getTeamStats() {
        return teamStats;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCaptainName(String captainName) {
        this.captainName = captainName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public void calculateTeamStats()
    {
        teamStats.setPlayers(players);

    }
}
