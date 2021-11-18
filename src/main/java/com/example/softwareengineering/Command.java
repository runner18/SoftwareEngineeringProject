/**
 * Softball Statistics Inventory Manager
 * Software to calculate and crunch various softball statistics to streamline the analysis process
 * Command.java - Command Interface, determining which command to call
 * Course: Software Engineering
 * Instructor: Dr. Malik
 * Date: November 21, 2021
 * Authors: Thane Class, Alex Diehl, Alex Duke, and Stacey Walters
 */

package com.example.softwareengineering;

public class Command {
    /**
     * Command Default Constructor
     * Default constructor for Command interface
     */
    public Command() {}

    /**
     * AccessExternalSourceMethod
     * Handles Commands and creates appropriate calls
     * @param command - call passed from User Interface of software
     */
    public void accessExternalSource(String command) {
        if (command == "help") {    //Determines help command is called
            HelpCommand help = new HelpCommand();   //Initializes HelpCommand
            help.desktopIntegration();  //Calls HelpCommand's desktop integration from the interface
        } else if (command == "export") {   //Determines export command is called
            ExportCommand export = new ExportCommand(); //Initializes ExportCommand
        }
    }
}
