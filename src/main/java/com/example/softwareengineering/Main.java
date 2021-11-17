package com.example.softwareengineering;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
        ToggleButton btnInsertData = (ToggleButton) scene.lookup("#btnInsertData");
        Button btnHelp = (Button) scene.lookup("#btnHelp");
        ToggleButton btnCompare = (ToggleButton) scene.lookup("#btnCompare");
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
        ToolBar tbInsert = (ToolBar) scene.lookup("#tbInsert");
        ToolBar tbCompare = (ToolBar) scene.lookup("#tbCompare");
        String[] pitcher = {"IP", "W", "L", "CG", "R", "ER", "B13", "K", "HR", "H"};
        String[] hitter = {"H", "2B", "3B", "HR", "BB", "K", "AVG", "OBP", "SLG", "OPS"};
        Tooltip TTOne = new Tooltip(hitter[0]);
        Tooltip TTTwo = new Tooltip(hitter[1]);
        Tooltip TTThree = new Tooltip(hitter[2]);
        Tooltip TTFour = new Tooltip(hitter[3]);
        Tooltip TTFive = new Tooltip(hitter[4]);
        Tooltip TTSix = new Tooltip(hitter[5]);
        Tooltip TTSeven = new Tooltip(hitter[6]);
        Tooltip TTEight = new Tooltip(hitter[7]);
        Tooltip TTNine = new Tooltip(hitter[8]);
        Tooltip TTTen = new Tooltip(hitter[9]);
        lblCompareStatOne.setTooltip(TTOne);
        lblCompareStatTwo.setTooltip(TTTwo);
        lblCompareStatThree.setTooltip(TTThree);
        lblCompareStatFour.setTooltip(TTFour);
        lblCompareStatFive.setTooltip(TTFive);
        lblCompareStatSix.setTooltip(TTSix);
        lblCompareStatSeven.setTooltip(TTSeven);
        lblCompareStatEight.setTooltip(TTEight);
        lblCompareStatNine.setTooltip(TTNine);
        lblCompareStatTen.setTooltip(TTTen);
        Command cmd = new Command();
        ColorPickerConverter cpc = new ColorPickerConverter();
        ColorPicker btnColorPicker = (ColorPicker) scene.lookup("#btnColorPicker");

        btnColorPicker.setOnAction(actionEvent -> {
            scene.getRoot().setStyle("-fx-base:" + cpc.pass(btnColorPicker.getValue()));
        });

        btnHelp.setOnAction(actionEvent -> {
            cmd.accessExternalSource("help");
        });

        btnCompare.setOnAction(actionEvent -> {
            if (btnCompare.isSelected()) {
                stage.setWidth(950);
                tbCompare.setVisible(true);
            } else {
                stage.setWidth(800);
                tbCompare.setVisible(false);
            }
        });

        btnInsertData.setOnAction(actionEvent -> {
            if (btnInsertData.isSelected()) {
                stage.setHeight(390);
                tbInsert.setVisible(true);
            } else {
                stage.setHeight(330);
                tbInsert.setVisible(false);
            }
        });

        btnComparePosition.setOnAction(actionEvent -> {
            if (btnComparePosition.getValue() == "Pitcher") {
                lblCompareStatOne.setPromptText(pitcher[0]);
                lblCompareStatTwo.setPromptText(pitcher[1]);
                lblCompareStatThree.setPromptText(pitcher[2]);
                lblCompareStatFour.setPromptText(pitcher[3]);
                lblCompareStatFive.setPromptText(pitcher[4]);
                lblCompareStatSix.setPromptText(pitcher[5]);
                lblCompareStatSeven.setPromptText(pitcher[6]);
                lblCompareStatEight.setPromptText(pitcher[7]);
                lblCompareStatNine.setPromptText(pitcher[8]);
                lblCompareStatTen.setPromptText(pitcher[9]);
                TTOne.setText(pitcher[0]);
                TTTwo.setText(pitcher[1]);
                TTThree.setText(pitcher[2]);
                TTFour.setText(pitcher[3]);
                TTFive.setText(pitcher[4]);
                TTSix.setText(pitcher[5]);
                TTSeven.setText(pitcher[6]);
                TTEight.setText(pitcher[7]);
                TTNine.setText(pitcher[8]);
                TTTen.setText(pitcher[9]);
            } else {
                lblCompareStatOne.setPromptText(hitter[0]);
                lblCompareStatTwo.setPromptText(hitter[1]);
                lblCompareStatThree.setPromptText(hitter[2]);
                lblCompareStatFour.setPromptText(hitter[3]);
                lblCompareStatFive.setPromptText(hitter[4]);
                lblCompareStatSix.setPromptText(hitter[5]);
                lblCompareStatSeven.setPromptText(hitter[6]);
                lblCompareStatEight.setPromptText(hitter[7]);
                lblCompareStatNine.setPromptText(hitter[8]);
                lblCompareStatTen.setPromptText(hitter[9]);
                 TTOne.setText(hitter[0]);
                 TTTwo.setText(hitter[1]);
                 TTThree.setText(hitter[2]);
                 TTFour.setText(hitter[3]);
                 TTFive.setText(hitter[4]);
                 TTSix.setText(hitter[5]);
                 TTSeven.setText(hitter[6]);
                 TTEight.setText(hitter[7]);
                 TTNine.setText(hitter[8]);
                 TTTen.setText(hitter[9]);
            }
        });

        scene.getAccelerators().put(KeyCombination.keyCombination("CTRL+H"), new Runnable() {
            @Override
            public void run() {
                cmd.accessExternalSource("help");
            }
        });

        scene.getAccelerators().put(KeyCombination.keyCombination("CTRL+E"), new Runnable() {
            @Override
            public void run() {
                cmd.accessExternalSource("export");
            }
        });
    }


    @Override
    public void stop(){
        System.out.println("Stage is closing");
        // Save file
        TableIterator thisThing = new TableIterator();
        thisThing.writeToFile();
    }

    public static void main(String[] args){
        launch();
    }

}
