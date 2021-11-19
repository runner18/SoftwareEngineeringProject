package com.example.softwareengineering;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Controller {
    @FXML
    TableView tblDisplayPitcher, tblDisplayHitter;
    @FXML
    TableColumn tblDisplayPitcherName, tblDisplayPitcherPosition, tblDisplayPitcherIP, tblDisplayPitcherW, tblDisplayPitcherL, tblDisplayPitcherCG,
                tblDisplayPitcherR, tblDisplayPitcherER, tblDisplayPitcherB13, tblDisplayPitcherK, tblDisplayPitcherHR, tblDisplayPitcherH,
                tblDisplayHitterName, tblDisplayHitterPosition, tblDisplayHitterH, tblDisplayHitter2B, tblDisplayHitter3B, tblDisplayHitterHR,
                tblDisplayHitterBB, tblDisplayHitterK, tblDisplayHitterAVG, tblDisplayHitterOBP, tblDisplayHitterSLG, tblDisplayHitterOPS;
    @FXML
    ComboBox btnInsertTeam, btnComparePosition, btnComparePlayerOne, btnComparePlayerTwo, btnInsertPosition;
    @FXML
    Button btnInsertSubmit, btnExportData;
    @FXML
    TextField btnInsertName, txtInsertStatOne, txtInsertStatTwo, txtInsertStatThree, txtInsertStatFour, txtInsertStatFive, txtInsertStatSix, txtInsertStatSeven, txtInsertStatEight, txtInsertStatNine, txtInsertStatTen,
              lblCompareStatOne, lblCompareStatTwo, lblCompareStatThree, lblCompareStatFour, lblCompareStatFive, lblCompareStatSix, lblCompareStatSeven, lblCompareStatEight, lblCompareStatNine, lblCompareStatTen;
    @FXML
    ListView listViewDisplayTeams;

    String[] pitcher = {"IP", "W", "L", "CG", "R", "ER", "B13", "K", "HR", "H"}; //Array of pitcher stat abbreviations
    String[] hitter = {"AB", "H", "1B", "2B", "3B", "HR", "BB", "K", "HBP", ""}; //Array of hitter stat abbreviations
    String[] hitterCompare = {"H", "2B", "3B", "HR", "BB", "K", "AVG", "OBP", "SLG","OPS"}; //Array of hitter comparison stat abbreviations
    String[] positions = {"Pitcher", "Hitter"}; //Array of possible positions
    
    public void initialize(){
        tblDisplayPitcherName.setCellValueFactory(new PropertyValueFactory<>("PlayerName"));
        tblDisplayPitcherPosition.setCellValueFactory(new PropertyValueFactory<>("Position"));
        tblDisplayPitcherIP.setCellValueFactory(new PropertyValueFactory<>("StatIP"));
        tblDisplayPitcherW.setCellValueFactory(new PropertyValueFactory<>("StatW"));
        tblDisplayPitcherL.setCellValueFactory(new PropertyValueFactory<>("StatL"));
        tblDisplayPitcherCG.setCellValueFactory(new PropertyValueFactory<>("StatCG"));
        tblDisplayPitcherR.setCellValueFactory(new PropertyValueFactory<>("StatR"));
        tblDisplayPitcherER.setCellValueFactory(new PropertyValueFactory<>("StatER"));
        tblDisplayPitcherB13.setCellValueFactory(new PropertyValueFactory<>("StatB13"));
        tblDisplayPitcherK.setCellValueFactory(new PropertyValueFactory<>("StatK"));
        tblDisplayPitcherHR.setCellValueFactory(new PropertyValueFactory<>("StatHR"));
        tblDisplayPitcherH.setCellValueFactory(new PropertyValueFactory<>("StatH"));

        Tooltip TTOne = new Tooltip(pitcher[0]);
        Tooltip TTTwo = new Tooltip(pitcher[1]);
        Tooltip TTThree = new Tooltip(pitcher[2]);
        Tooltip TTFour = new Tooltip(pitcher[3]);
        Tooltip TTFive = new Tooltip(pitcher[4]);
        Tooltip TTSix = new Tooltip(pitcher[5]);
        Tooltip TTSeven = new Tooltip(pitcher[6]);
        Tooltip TTEight = new Tooltip(pitcher[7]);
        Tooltip TTNine = new Tooltip(pitcher[8]);
        Tooltip TTTen = new Tooltip(pitcher[9]);
        txtInsertStatOne.setTooltip(TTOne);
        txtInsertStatTwo.setTooltip(TTTwo);
        txtInsertStatThree.setTooltip(TTThree);
        txtInsertStatFour.setTooltip(TTFour);
        txtInsertStatFive.setTooltip(TTFive);
        txtInsertStatSix.setTooltip(TTSix);
        txtInsertStatSeven.setTooltip(TTSeven);
        txtInsertStatEight.setTooltip(TTEight);
        txtInsertStatNine.setTooltip(TTNine);
        txtInsertStatTen.setTooltip(TTTen);
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

        DatabaseReader reader = new DatabaseReader();
        Player[] pitch = reader.getStats("p");
        String[] pitchNames = new String[pitch.length];
        ObservableList<PitcherModel> pitchList = FXCollections.observableArrayList();
        for(int i = 0; i < pitch.length; i++) {
            pitchList.add(new PitcherModel((Pitcher) pitch[i]));
            pitchNames[i] = pitch[i].getPersonName();
        }
        tblDisplayPitcher.setItems(pitchList);


        tblDisplayHitterName.setCellValueFactory(new PropertyValueFactory<>("PlayerName"));
        tblDisplayHitterPosition.setCellValueFactory(new PropertyValueFactory<>("Position"));
        tblDisplayHitterH.setCellValueFactory(new PropertyValueFactory<>("Stat1B"));
        tblDisplayHitter2B.setCellValueFactory(new PropertyValueFactory<>("Stat2B"));
        tblDisplayHitter3B.setCellValueFactory(new PropertyValueFactory<>("Stat3B"));
        tblDisplayHitterHR.setCellValueFactory(new PropertyValueFactory<>("StatHR"));
        tblDisplayHitterBB.setCellValueFactory(new PropertyValueFactory<>("StatBB"));
        tblDisplayHitterK.setCellValueFactory(new PropertyValueFactory<>("StatK"));
        tblDisplayHitterAVG.setCellValueFactory(new PropertyValueFactory<>("StatAVG"));
        tblDisplayHitterOBP.setCellValueFactory(new PropertyValueFactory<>("StatOBP"));
        tblDisplayHitterOPS.setCellValueFactory(new PropertyValueFactory<>("StatOPS"));
        tblDisplayHitterSLG.setCellValueFactory(new PropertyValueFactory<>("StatSLG"));
        Player[] hit = reader.getStats("b");
        String[] hitNames = new String[hit.length];
        ObservableList<HitterModel> hitList = FXCollections.observableArrayList();
        for(int i = 0; i < hit.length; i++) {
            hitList.add(new HitterModel((Hitter) hit[i]));
            hitNames[i] = hit[i].getPersonName();
        }
        tblDisplayHitter.setItems(hitList);

        reader.setTeams(hit, pitch);
        String[] teams = reader.getTeams();

        Collection<String> teamList = new ArrayList<>(List.of(teams));
        btnInsertTeam.getItems().addAll(teamList);

        ObservableList<String> teamItems = FXCollections.observableArrayList(teamList);
        listViewDisplayTeams.setItems(teamItems);

        String[] empty = {"  ", " "};
        Collection<String> emptyColl = new ArrayList<>(List.of(empty));
        ObservableList<String> emptyList = FXCollections.observableArrayList(emptyColl);

        listViewDisplayTeams.setOnMouseClicked(actionEvent -> {
            ObservableList<HitterModel> shortHitList = FXCollections.observableArrayList();
            for(int i = 0; i < hit.length; i++) {
                if (teams[listViewDisplayTeams.getSelectionModel().getSelectedIndex()].equals(hit[i].getPersonTeam())) {
                    shortHitList.add(new HitterModel((Hitter) hit[i]));
                }
            }
            if(teams[listViewDisplayTeams.getSelectionModel().getSelectedIndex()].equals("All")){
                shortHitList = FXCollections.observableArrayList(hitList);
            }
            tblDisplayHitter.setItems(shortHitList);
            ObservableList<PitcherModel> shortPitchList = FXCollections.observableArrayList();
            for(int i = 0; i < pitch.length; i++){
                if(teams[listViewDisplayTeams.getSelectionModel().getSelectedIndex()].equals(pitch[i].getPersonTeam())){
                    shortPitchList.add(new PitcherModel((Pitcher) pitch[i]));
                }
            }
            if(teams[listViewDisplayTeams.getSelectionModel().getSelectedIndex()].equals("All")){
                shortPitchList = FXCollections.observableArrayList(pitchList);
            }
            tblDisplayPitcher.setItems(shortPitchList);
        });

        TableIterator insertion = new TableIterator();
        Collection<String> positionList = new ArrayList<>(List.of(positions));
        ObservableList<String> positionItems = FXCollections.observableArrayList(positionList);
        btnInsertPosition.setItems(positionItems);

        btnInsertPosition.setOnAction(actionEvent -> {
            if (positions[btnInsertPosition.getSelectionModel().getSelectedIndex()].equals("Pitcher")) { //Checks to see which setting the btn is on
                txtInsertStatOne.setPromptText(pitcher[0]);
                txtInsertStatTwo.setPromptText(pitcher[1]);
                txtInsertStatThree.setPromptText(pitcher[2]);
                txtInsertStatFour.setPromptText(pitcher[3]);
                txtInsertStatFive.setPromptText(pitcher[4]);
                txtInsertStatSix.setPromptText(pitcher[5]);
                txtInsertStatSeven.setPromptText(pitcher[6]);
                txtInsertStatEight.setPromptText(pitcher[7]);
                txtInsertStatNine.setPromptText(pitcher[8]);
                txtInsertStatTen.setPromptText(pitcher[9]);
                TTOne.setText(pitcher[0]);
                TTTwo.setText(pitcher[1]);
                TTThree .setText(pitcher[2]);
                TTFour .setText(pitcher[3]);
                TTFive .setText(pitcher[4]);
                TTSix .setText(pitcher[5]);
                TTSeven .setText(pitcher[6]);
                TTEight .setText(pitcher[7]);
                TTNine .setText(pitcher[8]);
                TTTen .setText(pitcher[9]);
            }
            else {
                txtInsertStatOne.setPromptText(hitter[0]);
                txtInsertStatTwo.setPromptText(hitter[1]);
                txtInsertStatThree.setPromptText(hitter[2]);
                txtInsertStatFour.setPromptText(hitter[3]);
                txtInsertStatFive.setPromptText(hitter[4]);
                txtInsertStatSix.setPromptText(hitter[5]);
                txtInsertStatSeven.setPromptText(hitter[6]);
                txtInsertStatEight.setPromptText(hitter[7]);
                txtInsertStatNine.setPromptText(hitter[8]);
                txtInsertStatTen.setPromptText(hitter[9]);
                TTOne .setText(hitter[0]);
                TTTwo .setText(hitter[1]);
                TTThree .setText(hitter[2]);
                TTFour .setText(hitter[3]);
                TTFive .setText(hitter[4]);
                TTSix .setText(hitter[5]);
                TTSeven .setText(hitter[6]);
                TTEight .setText(hitter[7]);
                TTNine .setText(hitter[8]);
                TTTen .setText(hitter[9]);
            }
        });

        btnInsertSubmit.setOnAction(actionEvent -> {
            //get the text typed into the submit stats fields
            String name = btnInsertName.getText();
            String team;
            if(btnInsertTeam.getSelectionModel().getSelectedIndex() != -1) {
                team = teams[btnInsertTeam.getSelectionModel().getSelectedIndex()];
            }
            else{
                team = teams[0];
            }
            double stat1 = Double.parseDouble(txtInsertStatOne.getText());
            double stat2 = Double.parseDouble(txtInsertStatTwo.getText());
            double stat3 = Double.parseDouble(txtInsertStatThree.getText());
            double stat4 = Double.parseDouble(txtInsertStatFour.getText());
            double stat5 = Double.parseDouble(txtInsertStatFive.getText());
            double stat6 = Double.parseDouble(txtInsertStatSix.getText());
            double stat7 = Double.parseDouble(txtInsertStatSeven.getText());
            double stat8 = Double.parseDouble(txtInsertStatEight.getText());
            double stat9 = Double.parseDouble(txtInsertStatNine.getText());
            double stat10 = Double.parseDouble(txtInsertStatTen.getText() + 0);
            btnInsertName.setText("");
            txtInsertStatOne.setText("");
            txtInsertStatTwo.setText("");
            txtInsertStatThree.setText("");
            txtInsertStatFour.setText("");
            txtInsertStatFive.setText("");
            txtInsertStatSix.setText("");
            txtInsertStatSeven.setText("");
            txtInsertStatEight.setText("");
            txtInsertStatNine.setText("");
            txtInsertStatTen.setText("");
            String position = "";

            if(stat1 <= 0 || stat2 <= 0 || stat2 <= 0 || stat3 <= 0 || stat4 <= 0 || stat5 <= 0 || stat6 <= 0 || stat7 <= 0 || stat8 <= 0 || stat9 <= 0 || stat10 <= 0)
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Please enter in a number above zero for stats.");
                alert.setHeaderText("Incorrect Data");
                alert.setContentText("Incorrect Stats Entered");
                alert.showAndWait().ifPresent(rs -> {
                    if (rs == ButtonType.OK) {
                        System.out.println("Pressed OK.");
                    }
                });
                txtInsertStatOne.clear();
                txtInsertStatTwo.clear();
                txtInsertStatThree.clear();
                txtInsertStatFour.clear();
                txtInsertStatFive.clear();
                txtInsertStatSix.clear();
                txtInsertStatSeven.clear();
                txtInsertStatEight.clear();
                txtInsertStatNine.clear();
                txtInsertStatTen.clear();
                return;
            }

            if (positions[btnInsertPosition.getSelectionModel().getSelectedIndex()].equalsIgnoreCase("pitcher")) {
                position = "pitcher";
                Player newPitch = new Pitcher(String.valueOf(pitch.length), position, stat1, stat2, stat3, stat4, stat5, stat6, stat7, stat8, stat9, stat10);
                newPitch.setPersonName(name);
                newPitch.setPersonTeam(team);
                pitchList.add(new PitcherModel((Pitcher) newPitch));
                tblDisplayPitcher.setItems(pitchList);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Player Insert Attempt");
                alert.setHeaderText("Success!");
                alert.setContentText("Your player has been added to the bottom of the pitcher list");
                alert.showAndWait().ifPresent(rs -> {
                    if (rs == ButtonType.OK) {
                        System.out.println("Pressed OK.");
                    }
                });
            } else if (positions[btnInsertPosition.getSelectionModel().getSelectedIndex()].equalsIgnoreCase("hitter")) {
                position = "hitter";
                Player newHit = new Hitter(String.valueOf(hit.length), position, stat1, stat2, stat3, stat4, stat5, stat6, stat7, stat8, stat9);
                newHit.setPersonName(name);
                newHit.setPersonTeam(team);
                hitList.add(new HitterModel((Hitter) newHit));
                tblDisplayHitter.setItems(hitList);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Player Insert Attempt");
                alert.setHeaderText("Success!");
                alert.setContentText("Your player has been added to the bottom of the hitter list");
                alert.showAndWait().ifPresent(rs -> {
                    if (rs == ButtonType.OK) {
                        System.out.println("Pressed OK.");
                    }
                });
            }

            String[] tableIteratorInsert = new String[12];
            tableIteratorInsert[0] = name;//NAME
            tableIteratorInsert[1] = team;//TEAM
            tableIteratorInsert[2] = Double.toString(stat1);//atBats OR InningsPitched
            tableIteratorInsert[3] = Double.toString(stat2);//Hits OR Wins
            tableIteratorInsert[4] = Double.toString(stat3);//Singles OR Losses
            tableIteratorInsert[5] = Double.toString(stat4);//Doubles OR CompletedGames
            tableIteratorInsert[6] = Double.toString(stat5);//Triples OR Runs
            tableIteratorInsert[7] = Double.toString(stat6);//Homeruns OR EarnedRuns
            tableIteratorInsert[8] = Double.toString(stat7);//Walks for both
            tableIteratorInsert[9] = Double.toString(stat8);//Strikeouts for both
            tableIteratorInsert[10] = Double.toString(stat9);//HitByPitch OR HomerunsAllowed
            if(position.equals("pitcher")){
                tableIteratorInsert[11] = Double.toString(stat10);//HitsAllowed
            }
            insertion.insertInfo(position, tableIteratorInsert);
        });

        Collection<String> positions = new ArrayList<>();
        positions.add("Pitcher");
        positions.add("Hitter");
        btnComparePosition.getItems().addAll(positions);
        Collection<String> hitNameList = new ArrayList<>(List.of(hitNames));
        ObservableList<String> hitOList = FXCollections.observableArrayList(hitNameList);
        Collection<String> pitchNameList = new ArrayList<>(List.of(pitchNames));
        ObservableList<String> pitchOList = FXCollections.observableArrayList(pitchNameList);
        btnComparePosition.getSelectionModel().select(0);
        btnComparePlayerOne.setItems(pitchOList);
        btnComparePlayerTwo.setItems(pitchOList);
        BackgroundFill fillOne = new BackgroundFill(Color.ORANGERED, CornerRadii.EMPTY, Insets.EMPTY);
        BackgroundFill fillTwo = new BackgroundFill(Color.SKYBLUE, CornerRadii.EMPTY, Insets.EMPTY);
        BackgroundFill fillEmpty = new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY);
        Background backOne = new Background(fillOne);
        Background backTwo = new Background(fillTwo);
        Background backEmpty = new Background(fillEmpty);
        btnComparePlayerOne.setBackground(backOne);
        btnComparePlayerTwo.setBackground(backTwo);

        Background[] colors = {backOne, backTwo, backEmpty};

        /**
         * Compare Button Position Event Handler
         * Handles when the compare button position is changed (i.e. hitter to pitcher and vice versa)
         * Input: void
         * Returns: void
         */
        btnComparePosition.setOnAction(actionEvent -> {
            btnComparePlayerOne.setItems(emptyList);
            btnComparePlayerTwo.setItems(emptyList);
            lblCompareStatOne.setText("");
            lblCompareStatOne.setBackground(colors[2]);
            lblCompareStatTwo.setText("");
            lblCompareStatTwo.setBackground(colors[2]);
            lblCompareStatThree.setText("");
            lblCompareStatThree.setBackground(colors[2]);
            lblCompareStatFour.setText("");
            lblCompareStatFour.setBackground(colors[2]);
            lblCompareStatFive.setText("");
            lblCompareStatFive.setBackground(colors[2]);
            lblCompareStatSix.setText("");
            lblCompareStatSix.setBackground(colors[2]);
            lblCompareStatSeven.setText("");
            lblCompareStatSeven.setBackground(colors[2]);
            lblCompareStatEight.setText("");
            lblCompareStatEight.setBackground(colors[2]);
            lblCompareStatNine.setText("");
            lblCompareStatNine.setBackground(colors[2]);
            lblCompareStatTen.setText("");
            lblCompareStatTen.setBackground(colors[2]);
            if(btnComparePosition.getSelectionModel().getSelectedItem().toString().equals("Pitcher")){   //Checks if the current comparison menu is pitcher
                lblCompareStatOne.setPromptText(pitcher[0]);    //Sets prompt texts for each comparison textfield
                lblCompareStatTwo.setPromptText(pitcher[1]);
                lblCompareStatThree.setPromptText(pitcher[2]);
                lblCompareStatFour.setPromptText(pitcher[3]);
                lblCompareStatFive.setPromptText(pitcher[4]);
                lblCompareStatSix.setPromptText(pitcher[5]);
                lblCompareStatSeven.setPromptText(pitcher[6]);
                lblCompareStatEight.setPromptText(pitcher[7]);
                lblCompareStatNine.setPromptText(pitcher[8]);
                lblCompareStatTen.setPromptText(pitcher[9]);
                TTOne.setText(pitcher[0]);  //Sets tooltips for each comparison textfield
                TTTwo.setText(pitcher[1]);
                TTThree.setText(pitcher[2]);
                TTFour.setText(pitcher[3]);
                TTFive.setText(pitcher[4]);
                TTSix.setText(pitcher[5]);
                TTSeven.setText(pitcher[6]);
                TTEight.setText(pitcher[7]);
                TTNine.setText(pitcher[8]);
                TTTen.setText(pitcher[9]);
                btnComparePlayerOne.setItems(pitchOList);
                btnComparePlayerTwo.setItems(pitchOList);
            }
            else {    //Checks if the current comparison menu is hitter
                lblCompareStatOne.setPromptText(hitterCompare[0]); //Sets prompt texts for each comparison textfield
                lblCompareStatTwo.setPromptText(hitterCompare[1]);
                lblCompareStatThree.setPromptText(hitterCompare[2]);
                lblCompareStatFour.setPromptText(hitterCompare[3]);
                lblCompareStatFive.setPromptText(hitterCompare[4]);
                lblCompareStatSix.setPromptText(hitterCompare[5]);
                lblCompareStatSeven.setPromptText(hitterCompare[6]);
                lblCompareStatEight.setPromptText(hitterCompare[7]);
                lblCompareStatNine.setPromptText(hitterCompare[8]);
                lblCompareStatTen.setPromptText(hitterCompare[9]);
                TTOne.setText(hitterCompare[0]);  //Sets tooltips for each comparison textfield
                TTTwo.setText(hitterCompare[1]);
                TTThree.setText(hitterCompare[2]);
                TTFour.setText(hitterCompare[3]);
                TTFive.setText(hitterCompare[4]);
                TTSix.setText(hitterCompare[5]);
                TTSeven.setText(hitterCompare[6]);
                TTEight.setText(hitterCompare[7]);
                TTNine.setText(hitterCompare[8]);
                TTTen.setText(hitterCompare[9]);
                btnComparePlayerOne.setItems(hitOList);
                btnComparePlayerTwo.setItems(hitOList);
            }
        });

        btnComparePlayerOne.setOnAction(actionEvent -> {
            double[] compareStats;
            int[] indexes;
            try {
                if (!btnComparePlayerTwo.getSelectionModel().getSelectedItem().toString().equals(null)) {
                    if (btnComparePosition.getSelectionModel().getSelectedItem().toString().equals("Pitcher")) {
                        Comparison compare = new Comparison(pitch, btnComparePlayerOne.getSelectionModel().getSelectedItem().toString(), btnComparePlayerTwo.getSelectionModel().getSelectedItem().toString(), btnComparePosition.getSelectionModel().getSelectedItem().toString());
                        compareStats = compare.getStatsArray();
                        indexes = compare.getIndex();
                    } else {
                        Comparison compare = new Comparison(hit, btnComparePlayerOne.getSelectionModel().getSelectedItem().toString(), btnComparePlayerTwo.getSelectionModel().getSelectedItem().toString(), btnComparePosition.getSelectionModel().getSelectedItem().toString());
                        compareStats = compare.getStatsArray();
                        indexes = compare.getIndex();
                    }
                    int c = 0;
                    lblCompareStatOne.setText(Double.toString(compareStats[c]));
                    lblCompareStatOne.setBackground(colors[indexes[c++]]);
                    lblCompareStatTwo.setText(Double.toString(compareStats[c]));
                    lblCompareStatTwo.setBackground(colors[indexes[c++]]);
                    lblCompareStatThree.setText(Double.toString(compareStats[c]));
                    lblCompareStatThree.setBackground(colors[indexes[c++]]);
                    lblCompareStatFour.setText(Double.toString(compareStats[c]));
                    lblCompareStatFour.setBackground(colors[indexes[c++]]);
                    lblCompareStatFive.setText(Double.toString(compareStats[c]));
                    lblCompareStatFive.setBackground(colors[indexes[c++]]);
                    lblCompareStatSix.setText(Double.toString(compareStats[c]));
                    lblCompareStatSix.setBackground(colors[indexes[c++]]);
                    lblCompareStatSeven.setText(Double.toString(compareStats[c]));
                    lblCompareStatSeven.setBackground(colors[indexes[c++]]);
                    lblCompareStatEight.setText(Double.toString(compareStats[c]));
                    lblCompareStatEight.setBackground(colors[indexes[c++]]);
                    lblCompareStatNine.setText(Double.toString(compareStats[c]));
                    lblCompareStatNine.setBackground(colors[indexes[c++]]);
                    lblCompareStatTen.setText(Double.toString(compareStats[c]));
                    lblCompareStatTen.setBackground(colors[indexes[c++]]);
                }
            }catch(Exception e){}
        });

        //comparing two players
        btnComparePlayerTwo.setOnAction(actionEvent -> {
            double[] compareStats;
            int[] indexes;
            try {
                if (!btnComparePlayerOne.getSelectionModel().getSelectedItem().toString().equals(null)) {
                    if (btnComparePosition.getSelectionModel().getSelectedItem().toString().equals("Pitcher")) {
                        Comparison compare = new Comparison(pitch, btnComparePlayerOne.getSelectionModel().getSelectedItem().toString(), btnComparePlayerTwo.getSelectionModel().getSelectedItem().toString(), btnComparePosition.getSelectionModel().getSelectedItem().toString());
                        compareStats = compare.getStatsArray();
                        indexes = compare.getIndex();
                    } else {
                        Comparison compare = new Comparison(hit, btnComparePlayerOne.getSelectionModel().getSelectedItem().toString(), btnComparePlayerTwo.getSelectionModel().getSelectedItem().toString(), btnComparePosition.getSelectionModel().getSelectedItem().toString());
                        compareStats = compare.getStatsArray();
                        indexes = compare.getIndex();
                    }
                    int c = 0;
                    lblCompareStatOne.setText(Double.toString(compareStats[c]));
                    lblCompareStatOne.setBackground(colors[indexes[c++]]);
                    lblCompareStatTwo.setText(Double.toString(compareStats[c]));
                    lblCompareStatTwo.setBackground(colors[indexes[c++]]);
                    lblCompareStatThree.setText(Double.toString(compareStats[c]));
                    lblCompareStatThree.setBackground(colors[indexes[c++]]);
                    lblCompareStatFour.setText(Double.toString(compareStats[c]));
                    lblCompareStatFour.setBackground(colors[indexes[c++]]);
                    lblCompareStatFive.setText(Double.toString(compareStats[c]));
                    lblCompareStatFive.setBackground(colors[indexes[c++]]);
                    lblCompareStatSix.setText(Double.toString(compareStats[c]));
                    lblCompareStatSix.setBackground(colors[indexes[c++]]);
                    lblCompareStatSeven.setText(Double.toString(compareStats[c]));
                    lblCompareStatSeven.setBackground(colors[indexes[c++]]);
                    lblCompareStatEight.setText(Double.toString(compareStats[c]));
                    lblCompareStatEight.setBackground(colors[indexes[c++]]);
                    lblCompareStatNine.setText(Double.toString(compareStats[c]));
                    lblCompareStatNine.setBackground(colors[indexes[c++]]);
                    lblCompareStatTen.setText(Double.toString(compareStats[c]));
                    lblCompareStatTen.setBackground(colors[indexes[c++]]);
                }
            } catch(Exception e){
                System.out.println("[ERROR: Player Comparison] The Player Comparison Subsystem has experienced an error.");
            }
        });

        //putting the data in a more accessible location
        btnExportData.setOnAction(actionEvent -> {
            Command export = new Command();
            export.accessExternalSource("export");
        });
    }
}
