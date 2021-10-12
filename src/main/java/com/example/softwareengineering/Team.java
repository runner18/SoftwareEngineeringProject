package com.example.softwareengineering;

public class Team {
    String name;
    String captainName;
    String coachName;
    int teamSize;
    TeamStats teamStats;


    public Team(String name, String captainName, String coachName, int teamSize, TeamStats teamStats) {
        this.name = name;
        this.captainName = captainName;
        this.coachName = coachName;
        this.teamSize = teamSize;
        this.teamStats = teamStats;
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
        return teamSize;
    }

    public TeamStats getTeamStats() {
        return teamStats;
    }
}
