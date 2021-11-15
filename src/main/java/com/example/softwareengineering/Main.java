package com.example.softwareengineering;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("interface.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 290);
        stage.setTitle("Softball Statistics Inventory Manager");
        stage.getIcons().add(new Image("https://www.nicepng.com/png/full/40-407156_clip-art-library-stock-collection-of-softball-images.png"));
        stage.setScene(scene);
        stage.show();
        ComboBox btnInsertTeam = (ComboBox) scene.lookup("#btnInsertTeam");
        ToggleButton btnInsertData = (ToggleButton) scene.lookup("#btnInsertData");
        Button btnHelp = (Button) scene.lookup("#btnHelp");
        ToggleButton btnCompare = (ToggleButton) scene.lookup("#btnCompare");
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
        TableView<PitcherModel> tblDisplayPitcher = (TableView) scene.lookup("#tblDisplayPitcher");

        /*
        ObservableList<Pitcher> pitchList = FXCollections.observableArrayList();
        Player[] pitch = reader.getStats("p");
        ObservableList<Hitter> hitList = FXCollections.observableArrayList();
        Player[] hit = reader.getStats("b");
        /*reader.setTeams(hit, pitch);
        ObservableList<String> teamList = FXCollections.observableArrayList();
        String[] teamsAll = reader.getTeams();

        for(int i = 0; i < pitch.length; i++){
            pitchList.add((Pitcher)pitch[i]);
        }
        for(int i = 0; i < hit.length; i++){
            hitList.add((Hitter)hit[i]);
        }/*
        for(int i = 0; i < teamsAll.length; i++){
            teamList.add(teamsAll[i]);
        }

         */
        Button btnInsertSubmit = (Button) scene.lookup("#btnInsertSubmit");
        ToolBar tbInsert = (ToolBar) scene.lookup("#tbInsert");
        ToolBar tbCompare = (ToolBar) scene.lookup("#tbCompare");

        //TableColumn<Pitcher, String> tblDisplayPitcherName = new TableColumn<>("#tblDisplayPitcherName");
        //tblDisplayPitcherName.setCellValueFactory(new PropertyValueFactory<>("personName"));

/*        TableColumn<PitcherModel, String> tblDisplayPitcherName = new TableColumn<>("#tblDisplayPitcherName");

        tblDisplayPitcherName.setCellValueFactory(new PropertyValueFactory<>("PlayerName"));

        Player[] pitch = reader.getStats("p");
        ObservableList<PitcherModel> pitchList = FXCollections.observableArrayList();
        for(int i = 0; i < pitch.length; i++) {
            pitchList.add(new PitcherModel((Pitcher) pitch[i]));
        }
        PitcherModel test = new PitcherModel((Pitcher) pitch[0]);
        System.out.println(tblDisplayPitcherName.getCellValueFactory());
        tblDisplayPitcher.setItems(pitchList);
        tblDisplayPitcher.getColumns().addAll(tblDisplayPitcherName);

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
        /*TableView<Hitter> tblDisplayHitter = (TableView) scene.lookup("#tblDisplayPitcher");

        tblDisplayHitter.setItems(hitList);*/

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
            if (!btnInsertData.isSelected()) {
                if (btnCompare.isSelected()) {
                    tbInsert.setVisible(false);
                    stage.setHeight(390);
                    tbCompare.setVisible(true);
                    btnInsertData.setDisable(true);
                } else {
                    stage.setHeight(330);
                    tbCompare.setVisible(false);
                    btnInsertData.setDisable(false);
                }
            }
        });

        btnInsertData.setOnAction(actionEvent -> {
            if(!btnCompare.isSelected()) {
                if (btnInsertData.isSelected()) {
                    tbCompare.setVisible(false);
                    btnCompare.setDisable(true);
                    if (btnInsertSubmit.getText() != "Submit Hitter Stats") {
                        btnInsertData.setDisable(true);
                        stage.setHeight(390);
                        tbInsert.setVisible(true);
                    } else {
                        stage.setHeight(330);
                        tbInsert.setVisible(false);
                    }
                } else {
                    stage.setHeight(330);
                    tbInsert.setVisible(false);
                    btnCompare.setDisable(false);
                }
            }
        });

        /*btnInsertSubmit.setOnAction(actionEvent -> {
            if (btnInsertSubmit.getText() != "Submit Pitcher Stats") { //Checks to see which setting the btn is on
                btnInsertSubmit.setText("Submit Pitcher Stats");
            } else {
                btnInsertSubmit.setText("Submit Hitter Stats");
                btnInsertData.setDisable(false);
            }
        });*/

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


    public static void main(String[] args){
        launch();
    }

}
