/**
 * Softball Statistics Inventory Manager
 * Software to calculate and crunch various softball statistics to streamline the analysis process
 * ColorPickerConverter.java - Converts passed Color object to a String hex value (SO credits for implementation)
 * Course: Software Engineering
 * Instructor: Dr. Malik
 * Date: November 21, 2021
 * Authors: Thane Class, Alex Diehl, Alex Duke, and Stacey Walters
 */

package com.example.softwareengineering;

import javafx.scene.paint.Color;

public class ColorPickerConverter {

    /**
     * Pass Method
     * Converts a passed Color object into a string HEX value
     * @param color - passed Color object from Color Picker
     * @return - String HEX value
     */
    public static String pass(Color color) {    //Math logic derived from Moe on StackOverflow
        int RGBValue = 255;

        return String.format( "#%02X%02X%02X",
                (int)(color.getRed()*RGBValue),
                (int)(color.getGreen()*RGBValue),
                (int)(color.getBlue()*RGBValue));
    }
}
