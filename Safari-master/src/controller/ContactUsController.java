/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author shima
 */
public class ContactUsController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void  exitBtn(MouseEvent e){
        Platform.exit();
    }

    @FXML
    public void  backBtn(MouseEvent e){
        HomeController.offerStage.close();
        LoginController.homeStage.show();
    }
    public void minBtn(MouseEvent event) {
        Stage stage = (Stage)HomeController.contactusStage.getScene().getWindow();
        stage.setIconified(true);
    }
}
