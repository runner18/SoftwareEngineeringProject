/**
 * Softball Statistics Inventory Manager
 * Software to calculate and crunch various softball statistics to streamline the analysis process
 * ExportCommand.java - Class for handling desktop access for export command
 * Course: Software Engineering
 * Instructor: Dr. Malik
 * Date: November 21, 2021
 * Authors: Thane Class, Alex Diehl, Alex Duke, and Stacey Walters
 */

package com.example.softwareengineering;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import javax.swing.*;

public class ExportCommand extends Command {

    /**
     * ExportCommand Default constructor
     * Default constructor for the export command
     */
    public ExportCommand() {
        TableIterator insertion = new TableIterator();
        JFileChooser j = new JFileChooser("C:"); //Stores the file into specified location
        int r = j.showSaveDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) { //Export file using external library methods
            insertion.exportFile(j.getSelectedFile().getAbsolutePath());
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION); //Creates an alert popup
        alert.setTitle("File Export Attempt");
        alert.setHeaderText("Success!"); //Notificastion of success
        alert.setContentText("Files have been saved in the specified location\nThey are named Batting and Pitching stats respectively");
        alert.showAndWait().ifPresent(rs -> {
            if (rs == ButtonType.OK) {
                System.out.println("Pressed OK.");
            }
        });
    }
}
