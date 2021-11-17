package com.example.softwareengineering;

public class Command {

    public Command() {}

    public void accessExternalSource(String command) {
        if (command == "help") {
            HelpCommand help = new HelpCommand();
            help.desktopIntegration();
        } else if (command == "export") {
            ExportCommand export = new ExportCommand();
        }
    }
}
