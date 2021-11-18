/**
 * Softball Statistics Inventory Manager
 * Software to calculate and crunch various softball statistics to streamline the analysis process
 * Person.java - interface to define various generalized information regarding people in database
 * Course: Software Engineering
 * Instructor: Dr. Malik
 * Date: November 21, 2021
 * Authors: Thane Class, Alex Diehl, Alex Duke, and Stacey Walters
 */

package com.example.softwareengineering;

abstract class Person {
    private String personName, personTeam, personTitle; //Initialzing strings for each attribute

    /**
     * GetPersonName Accessor Method
     * Retrieves the person's name
     * @return - person's name as a String
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * SetPersonName Mutator Method
     * Sets the person's name to a specified input
     * @param personName - input person's name as a String
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * GetPersonTeam Accessor Method
     * Retrieves the person's team
     * @return - person's team as a String
     */
    public String getPersonTeam() {
        return personTeam;
    }

    /**
     * SetPersonTeam Mutator Method
     * Sets the person's team to a specified input
     * @param personTeam - input person's team as a String
     */
    public void setPersonTeam(String personTeam) {
        this.personTeam = personTeam;
    }

    /**
     * GetPersonTitle Accessor Method
     * Retrieves the person's title
     * @return - person's title as a String
     */
    public String getPersonTitle() {
        return personTitle;
    }

    /**
     * SetPersonTitle Mutator Method
     * Sets the person's title to a specified input
     * @param personTitle - input person's title as a String
     */
    public void setPersonTitle(String personTitle) {
        this.personTitle = personTitle;
    }
}
