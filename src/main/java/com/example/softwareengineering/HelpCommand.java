package com.example.softwareengineering;

import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;

public class HelpCommand extends Command {

    public HelpCommand() {}
    public void desktopIntegration() {
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI("https://alexduke.net/instructions_hidden.html"));
        } catch (IOException | URISyntaxException e2) {
            e2.printStackTrace();
        }
    }
}
