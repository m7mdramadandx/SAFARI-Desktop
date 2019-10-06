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

public class special_offer implements Initializable {



    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }



    public void exit(MouseEvent e) {
        Platform.exit();
    }

    public void minimize(MouseEvent mouseEvent) {
        Stage stage = (Stage) staff_home.special_offer_stage.getScene().getWindow();
        stage.setIconified(true);

    }

    public void back(MouseEvent mouseEvent) {
        main_page.staff_home_stage.show();
        staff_home.special_offer_stage.close();

    }
}
    

