/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class aswan implements Initializable {
    Stage aswan_stage;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void exit(MouseEvent mouseEvent) {
        Platform.exit();
    }

    public void back(MouseEvent mouseEvent) {
        profile.offers_stage.show();
        offers.aswan_stage.close();

    }

    public void minimize(MouseEvent mouseEvent) {
        Stage stage = (Stage) offers.aswan_stage.getScene().getWindow();
        stage.setIconified(true);
    }
}
    

