package com.example.softwareengineering;

//the abstract class for a team player, either a hitter or pitcher are the child classes
abstract class Person {
    private String personName, personTeam;

    public String getPersonName()
    {
        return personName;
    }
    //added a setName as there was no way previously to set a name
    public void setPersonName(String personName){this.personName = personName;}

    public String getPersonTeam()
    {
        return personTeam;
    }
    //added a setTeam as there was no way previously to set a team
    public void setPersonTeam(String personTeam){this.personTeam = personTeam;}

    public String getPersonTitle()
    {
        return personTitle;
    }

    String personTitle;


}
