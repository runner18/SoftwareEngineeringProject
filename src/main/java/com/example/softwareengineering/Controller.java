package com.example.softwareengineering;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Controller {
    /*
    public void initialize() {
        DatabaseReader reader = new DatabaseReader();

        @FXML
        TableView<PitcherModel> tblDisplayPitcher;

        @FXML
        TableColumn<PitcherModel, String> tblDisplayPitcherName;

        tblDisplayPitcherName.setCellValueFactory(new PropertyValueFactory<>("PlayerName"));

        Player[] pitch = reader.getStats("p");
        ObservableList<PitcherModel> pitchList = FXCollections.observableArrayList();
        for (int i = 0; i < pitch.length; i++) {
            pitchList.add(new PitcherModel((Pitcher) pitch[i]));
        }
        PitcherModel test = new PitcherModel((Pitcher) pitch[0]);
        System.out.println(tblDisplayPitcherName.getCellValueFactory());
        tblDisplayPitcher.setItems(pitchList);
        tblDisplayPitcher.getColumns().addAll(tblDisplayPitcherName);
    }
    */
    @FXML
    TableView tblDisplayPitcher;
    @FXML
    TableColumn tblDisplayPitcherName;
    @FXML
    TableColumn tblDisplayPitcherPosition;
    @FXML
    TableColumn tblDisplayPitcherIP;
    @FXML
    TableColumn tblDisplayPitcherW;
    @FXML
    TableColumn tblDisplayPitcherL;
    @FXML
    TableColumn tblDisplayPitcherCG;
    @FXML
    TableColumn tblDisplayPitcherR;
    @FXML
    TableColumn tblDisplayPitcherER;
    @FXML
    TableColumn tblDisplayPitcherB13;
    @FXML
    TableColumn tblDisplayPitcherK;
    @FXML
    TableColumn tblDisplayPitcherHR;
    @FXML
    TableColumn tblDisplayPitcherH;

    @FXML
    TableView tblDisplayHitter;
    @FXML
    TableColumn tblDisplayHitterName;
    @FXML
    TableColumn tblDisplayHitterPosition;
    @FXML
    TableColumn tblDisplayHitterH;
    @FXML
    TableColumn tblDisplayHitter2B;
    @FXML
    TableColumn tblDisplayHitter3B;
    @FXML
    TableColumn tblDisplayHitterHR;
    @FXML
    TableColumn tblDisplayHitterBB;
    @FXML
    TableColumn tblDisplayHitterK;
    @FXML
    TableColumn tblDisplayHitterAVG;
    @FXML
    TableColumn tblDisplayHitterOBP;
    @FXML
    TableColumn tblDisplayHitterSLG;
    @FXML
    TableColumn tblDisplayHitterOPS;
    @FXML
    ComboBox btnInsertTeam;
    @FXML
    ListView listViewDisplayTeams;
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
        DatabaseReader reader = new DatabaseReader();
        Player[] pitch = reader.getStats("p");
        ObservableList<PitcherModel> pitchList = FXCollections.observableArrayList();
        for(int i = 0; i < pitch.length; i++) {
            pitchList.add(new PitcherModel((Pitcher) pitch[i]));
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
        ObservableList<HitterModel> hitList = FXCollections.observableArrayList();
        for(int i = 0; i < hit.length; i++) {
            hitList.add(new HitterModel((Hitter) hit[i]));
        }
        tblDisplayHitter.setItems(hitList);

        reader.setTeams(hit, pitch);
        String[] teams = reader.getTeams();

        Collection<String> teamList = new ArrayList<>(List.of(teams));
        btnInsertTeam.getItems().addAll(teamList);

        ObservableList<String> teamItems = FXCollections.observableArrayList(teamList);
        listViewDisplayTeams.setItems(teamItems);
    }
}
