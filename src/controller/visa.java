/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class visa implements Initializable {


    public TextField visa_num;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }


    public void exit(MouseEvent mouseEvent) {
    }

    public void back(MouseEvent mouseEvent) {
    }

    public void minimize(MouseEvent mouseEvent) {
    }

    public void confirm(ActionEvent actionEvent) {
    }

    public void contact_us(MouseEvent mouseEvent) {
        main_page.contact_us_stage.show();
    }
}
    

