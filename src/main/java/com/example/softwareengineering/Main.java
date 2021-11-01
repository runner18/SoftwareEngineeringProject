package com.example.softwareengineering;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("interface.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 350);
        stage.setTitle("Softball Statistics Inventory Manager");
        stage.getIcons().add(new Image("https://www.nicepng.com/png/full/40-407156_clip-art-library-stock-collection-of-softball-images.png"));
        stage.setScene(scene);
        stage.show();

        ComboBox btnInsertTeam = (ComboBox) scene.lookup("#btnInsertTeam");
        TextField txtInsertName = (TextField) scene.lookup("#txtInsertName");
        TextField txtInsertStatOne = (TextField) scene.lookup("#txtInsertStatOne");
        TextField txtInsertStatTwo = (TextField) scene.lookup("#txtInsertStatTwo");
        TextField txtInsertStatThree = (TextField) scene.lookup("#txtInsertStatThree");
        TextField txtInsertStatFour = (TextField) scene.lookup("#txtInsertStatFour");
        TextField txtInsertStatFive = (TextField) scene.lookup("#txtInsertStatFive");
        TextField txtInsertStatSix = (TextField) scene.lookup("#txtInsertStatSix");
        TextField txtInsertStatSeven = (TextField) scene.lookup("#txtInsertStatSeven");
        TextField txtInsertStatEight = (TextField) scene.lookup("#txtInsertStatEight");
        TextField txtInsertStatNine = (TextField) scene.lookup("#txtInsertStatNine");
        TextField txtInsertStatTen = (TextField) scene.lookup("#txtInsertStatTen");
        ComboBox btnComparePlayerOne = (ComboBox) scene.lookup("#btnComparePlayerOne");
        ComboBox btnComparePlayerTwo = (ComboBox) scene.lookup("#btnComparePlayerTwo");
        ComboBox btnComparePosition = (ComboBox) scene.lookup("#btnComparePosition");
        TextField lblCompareStatOne = (TextField) scene.lookup("#lblCompareStatOne");
        TextField lblCompareStatTwo = (TextField) scene.lookup("#lblCompareStatTwo");
        TextField lblCompareStatThree = (TextField) scene.lookup("#lblCompareStatThree");
        TextField lblCompareStatFour = (TextField) scene.lookup("#lblCompareStatFour");
        TextField lblCompareStatFive = (TextField) scene.lookup("#lblCompareStatFive");
        TextField lblCompareStatSix = (TextField) scene.lookup("#lblCompareStatSix");
        TextField lblCompareStatSeven = (TextField) scene.lookup("#lblCompareStatSeven");
        TextField lblCompareStatEight = (TextField) scene.lookup("#lblCompareStatEight");
        TextField lblCompareStatNine = (TextField) scene.lookup("#lblCompareStatNine");
        TextField lblCompareStatTen = (TextField) scene.lookup("#lblCompareStatTen");
        TableView tblDisplayPitcher = (TableView) scene.lookup("#tblDisplayPitcher");
        Button btnInsertSubmit = (Button) scene.lookup("#btnInsertSubmit");
        /*
        TableColumn tblDisplayPitcherName = (TableColumn) scene.lookup("#tblDisplayPitcherName");
        TableColumn tblDisplayPitcherPosition = (TableColumn) scene.lookup("#tblDisplayPitcherPosition");
        TableColumn tblDisplayPitcherH = (TableColumn) scene.lookup("#tblDisplayPitcherH");
        TableColumn tblDisplayPitcher2B = (TableColumn) scene.lookup("#tblDisplayPitcher2B");
        TableColumn tblDisplayPitcher3B = (TableColumn) scene.lookup("#tblDisplayPitcher3B");
        TableColumn tblDisplayPitcherHR = (TableColumn) scene.lookup("#tblDisplayPitcherHR");
        TableColumn tblDisplayPitcherBB = (TableColumn) scene.lookup("#tblDisplayPitcherBB");
        TableColumn tblDisplayPitcherK = (TableColumn) scene.lookup("#tblDisplayPitcherK");
        TableColumn tblDisplayPitcherAVG = (TableColumn) scene.lookup("#tblDisplayPitcherAVG");
        TableColumn tblDisplayPitcherOBP = (TableColumn) scene.lookup("#tblDisplayPitcherOBP");
        TableColumn tblDisplayPitcherSLG = (TableColumn) scene.lookup("#tblDisplayPitcherSLG");
        TableColumn tblDisplayPitcherOPS = (TableColumn) scene.lookup("#tblDisplayPitcherOPS");
        */
        TableView tblDisplayHitter = (TableView) scene.lookup("#tblDisplayHitter");
        /*
        TableColumn tblDisplayHitterName = (TableColumn) scene.lookup("#tblDisplayHitterName");
        TableColumn tblDisplayHitterPosition = (TableColumn) scene.lookup("#tblDisplayHitterPosition");
        TableColumn tblDisplayHitterIP = (TableColumn) scene.lookup("#tblDisplayHitterIP");
        TableColumn tblDisplayHitterW = (TableColumn) scene.lookup("#tblDisplayHitterW");
        TableColumn tblDisplayHitterL = (TableColumn) scene.lookup("#tblDisplayHitterL");
        TableColumn tblDisplayHitterCG = (TableColumn) scene.lookup("#tblDisplayHitterCG");
        TableColumn tblDisplayHitterR = (TableColumn) scene.lookup("#tblDisplayHitterR");
        TableColumn tblDisplayHitterER = (TableColumn) scene.lookup("#tblDisplayHitterER");
        TableColumn tblDisplayHitterB13 = (TableColumn) scene.lookup("#tblDisplayHitterB13");
        TableColumn tblDisplayHitterK = (TableColumn) scene.lookup("#tblDisplayHitterK");
        TableColumn tblDisplayHitterHR = (TableColumn) scene.lookup("#tblDisplayHitterHR");
        TableColumn tblDisplayHitterH = (TableColumn) scene.lookup("#tblDisplayHitterH");
        */
        btnInsertSubmit.setOnAction(actionEvent -> {
            if (btnInsertSubmit.getText() != "Submit Pitcher Stats") {
                btnInsertSubmit.setText("Submit Pitcher Stats");
            } else {
                btnInsertSubmit.setText("Submit Hitter Stats");
            }
        });

        Command cmd = new Command();

        scene.getAccelerators().put(KeyCombination.keyCombination("CTRL+H"), new Runnable() {
            @Override
            public void run() {
                cmd.accessExternalSource("help");
            }
        });
        scene.getAccelerators().put(KeyCombination.keyCombination("CTRL+A"), new Runnable() {
            @Override
            public void run() {
                cmd.accessExternalSource("about");
            }
        });
        scene.getAccelerators().put(KeyCombination.keyCombination("CTRL+E"), new Runnable() {
            @Override
            public void run() {
                cmd.accessExternalSource("export");
            }
        });
    }


    public static void main(String[] args){
        //This is how I was testing it rather than making a main class in DatabaseReader.java
        DatabaseReader reading = new DatabaseReader();
        Player[] whatever = reading.getStats("b");//Should be how the final product is held but
        //the problem right now is something in the creation of the hitter objects
        /*int i = 0;
        while(!whatever[i].getPersonName().equals(null)){
            System.out.println(whatever[i++].getPersonName());
        }*///More testing stuff to make sure it got back here
        launch();
    }

}
