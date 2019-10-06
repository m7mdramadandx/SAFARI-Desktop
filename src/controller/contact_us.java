/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class contact_us implements Initializable {
    static Stage contact_stage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }


    public void back(MouseEvent mouseEvent) {
    }

    public void exit(MouseEvent mouseEvent) {
        main_page.contact_us_stage.close();
    }

    public void minimize(MouseEvent mouseEvent) {
        Stage stage = (Stage) main_page.contact_us_stage.getScene().getWindow();
        stage.setIconified(true);

    }
}
