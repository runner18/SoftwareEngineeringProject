package com.example.softwareengineering;

abstract class Player extends Person {
    protected String playerNumber, playerPosition;

    public Player(String playerNumber, String playerPosition)
    {
        this.playerNumber = playerNumber;
        this.playerPosition = playerPosition;
    }


    public String getPlayerNumber()
    {
        return playerNumber;
    }

    public void setPlayerNumber(String playerNumber)
    {
        this.playerNumber = playerNumber;
    }

    public String getPlayerPosition()
    {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition)
    {
        this.playerPosition = playerPosition;
    }
}
