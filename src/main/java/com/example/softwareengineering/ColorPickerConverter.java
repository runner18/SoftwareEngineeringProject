package com.example.softwareengineering;

import javafx.scene.paint.Color;

public class ColorPickerConverter {

    public static String pass(Color color) {
        int red = ((int) Math.round(color.getRed() * 255)) << 24;
        int green = ((int) Math.round(color.getGreen() * 255)) << 16;
        int blue = ((int) Math.round(color.getBlue() * 255)) << 8;
        int opacity = ((int) Math.round(color.getOpacity() * 255));
        return String.format("#%08X", (red + green + blue + opacity));
    }
}
