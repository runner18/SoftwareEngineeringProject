package com.example.softwareengineering;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class AboutCommand extends Command {

    public AboutCommand() {}

    public void desktopIntegration() {
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI("https://alexduke.net/about_hidden.html"));
        } catch (IOException | URISyntaxException e2) {
            e2.printStackTrace();
        }
    }
}
