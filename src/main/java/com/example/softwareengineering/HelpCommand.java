/**
 * Softball Statistics Inventory Manager
 * Software to calculate and crunch various softball statistics to streamline the analysis process
 * HelpCommand.java - Class for handling desktop access and integration of web browser redirection
 * Course: Software Engineering
 * Instructor: Dr. Malik
 * Date: November 21, 2021
 * Authors: Thane Class, Alex Diehl, Alex Duke, and Stacey Walters
 */
package com.example.softwareengineering;

import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;

public class HelpCommand extends Command {

    /**
     * HelpCommand Default Constructor
     * Default constructor for HelpCommand class
     */
    public HelpCommand() {}

    /**
     * DesktopIntegration Method
     * Accesses desktop utilizing importerd Desktop library
     */
    public void desktopIntegration() {
        String instructions = "https://alexduke.net/about_hidden.html";

        Desktop d = Desktop.getDesktop();   //Allows access to Desktop to fetch browser
        try {
            d.browse(new URI(instructions));    //Access browser directly, redirecting to link
        } catch (Exception e) {  //If an error occurs, throw it in Console
            System.out.println("[ERROR: Help Command] The help command subsystem has experienced an error.");
        }
    }
}
