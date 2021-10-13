package com.example.softwareengineering;

//the abstract class fro a team player, either a hitte ror pitcher are teh child classes
abstract class Person {
    private String personName, personTeam;

    public String getPersonName()
    {
        return personName;
    }

    public String getPersonTeam()
    {
        return personTeam;
    }

    public String getPersonTitle()
    {
        return personTitle;
    }

    String personTitle;


}
