package com.example.softwareengineering;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;

public class Command {

    public Command() {}

    public void accessExternalSource(String command) {
        if (command == "help") {
            HelpCommand help = new HelpCommand();
            help.desktopIntegration();
        } else if (command == "compare") {
            CompareCommand compare = new CompareCommand();
            compare.desktopIntegration();
        } else if (command == "export") {
            ExportCommand export = new ExportCommand();
        } else if (command == "insert") {
            InsertCommand insert = new InsertCommand();
        }
    }
}
