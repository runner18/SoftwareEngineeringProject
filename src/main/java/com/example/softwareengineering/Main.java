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
        Scene scene = new Scene(fxmlLoader.load(), 800, 290);
        stage.setTitle("Softball Statistics Inventory Manager");
        stage.getIcons().add(new Image("https://www.nicepng.com/png/full/40-407156_clip-art-library-stock-collection-of-softball-images.png"));
        stage.setScene(scene);
        stage.show();
        ToggleButton btnInsertData = (ToggleButton) scene.lookup("#btnInsertData");
        Button btnHelp = (Button) scene.lookup("#btnHelp");
        ToggleButton btnCompare = (ToggleButton) scene.lookup("#btnCompare");
        Button btnInsertSubmit = (Button) scene.lookup("#btnInsertSubmit");
        ToolBar tbInsert = (ToolBar) scene.lookup("#tbInsert");
        ToolBar tbCompare = (ToolBar) scene.lookup("#tbCompare");
        ListView listViewDisplayTeams = (ListView) scene.lookup("#listViewDisplayTeams");

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
                    stage.setWidth(975);
                    tbCompare.setVisible(true);
                } else {
                    stage.setWidth(815);
                    tbCompare.setVisible(false);

                }
        });

        btnInsertData.setOnAction(actionEvent -> {
                if (btnInsertData.isSelected()) {
                    if (btnInsertSubmit.getText() != "Submit Hitter Stats") {
                        stage.setHeight(365);
                        tbInsert.setVisible(true);
                    } else {
                        if(btnCompare.isSelected()) {
                            stage.setHeight(330);
                            tbInsert.setVisible(false);
                        } else {
                            stage.setHeight(330);
                            tbInsert.setVisible(false);
                        }
                    }
                } else {
                    stage.setHeight(330);
                    tbInsert.setVisible(false);
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

    public static void main(String[] args){
        launch();
    }

}
