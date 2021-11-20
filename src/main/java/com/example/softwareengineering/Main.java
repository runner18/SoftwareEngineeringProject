/**
 * Softball Statistics Inventory Manager
 * Software to calculate and crunch various softball statistics to streamline the analysis process
 * Main.java - Main Class
 * Course: Software Engineering
 * Instructor: Dr. Malik
 * Date: November 21, 2021
 * Authors: Thane Class, Alex Diehl, Alex Duke, and Stacey Walters
 */

package com.example.softwareengineering;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("interface.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 801, 290);
        stage.setTitle("Softball Statistics Inventory Manager");
        stage.getIcons().add(new Image("https://www.nicepng.com/png/full/40-407156_clip-art-library-stock-collection-of-softball-images.png"));
        stage.setScene(scene);
        stage.show();

        Command cmd = new Command();    //Initializing the Command interface

        ToggleButton btnInsertData = (ToggleButton) scene.lookup("#btnInsertData"); //UI elements
        Button btnHelp = (Button) scene.lookup("#btnHelp");
        ToggleButton btnCompare = (ToggleButton) scene.lookup("#btnCompare");
        ToolBar tbInsert = (ToolBar) scene.lookup("#tbInsert");
        ToolBar tbCompare = (ToolBar) scene.lookup("#tbCompare");
        ColorPicker btnColorPicker = (ColorPicker) scene.lookup("#btnColorPicker");


        /**
         * ColorPicker Event Handler
         * Handles when the color picker button is clicked
         * Input: Value of selected color from color picker
         */
        btnColorPicker.setOnAction(actionEvent -> {
            ColorPickerConverter cpc = new ColorPickerConverter();
            scene.getRoot().setStyle("-fx-base:" + cpc.pass(btnColorPicker.getValue()));
        });

        /**
         * Help Button Event Handler
         * Handles when the help button is clicked
         */
        btnHelp.setOnAction(actionEvent -> {
            cmd.accessExternalSource("help"); //Calls "help" command utilizing the Command interface
        });

        /**
         * Compare Button Event Handler
         * Handles when the compare button is clicked
         */
        btnCompare.setOnAction(actionEvent -> {
            if (btnCompare.isSelected()) {  //Expands the menu if the button is selected
                stage.setWidth(955);
                tbCompare.setVisible(true);
            } else {    //Reverts the menu expansion if the button is NOT selected
                stage.setWidth(800);
                tbCompare.setVisible(false);
            }
        });

        /**
         * Insert Button Event Handler
         * Handles when the insert button is clicked
         */
        btnInsertData.setOnAction(actionEvent -> {
            if (btnInsertData.isSelected()) {   //Expands the menu if the button is toggled
                stage.setHeight(390);
                tbInsert.setVisible(true);
            } else {    //Reverts the menu expansion if the menu button is NOT toggled
                stage.setHeight(330);
                tbInsert.setVisible(false);
            }
        });

        /**
         * Help Shortcut Event Handler
         * Handles when the help command shortcut is activated (CTRL+H)
         * Input: CTRL+H
         */
        scene.getAccelerators().put(KeyCombination.keyCombination("CTRL+H"), new Runnable() {   //Detects CTRL+H input
            @Override
            public void run() {
                cmd.accessExternalSource("help");   //Runs the help command, identical to help button
            }
        });

        /**
         * Export Shortcut Event Handler
         * Handles when the export command is activated (CTRL+E)
         */
        scene.getAccelerators().put(KeyCombination.keyCombination("CTRL+E"), new Runnable() {   //Detects CTRL+E input
            @Override
            public void run() {
                cmd.accessExternalSource("export"); //Runs the export command, identical to export command
            }
        });
    }

    /**
     * Application Closing Event Handler
     * Handles when the application is closing and saves the data automatically
     */
    @Override
    public void stop(){
        TableIterator thisThing = new TableIterator();  //Iterate through database/external source
        thisThing.writeToFile();    //Write modifications to file prior to closing
    }

    /**
     * Main
     * Handles the application's fundamental process
     */
    public static void main(String[] args){
        launch();
    }
}