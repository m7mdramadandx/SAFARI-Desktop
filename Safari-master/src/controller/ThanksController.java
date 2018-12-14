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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author shima
 */
public class ThanksController implements Initializable {

    @FXML
    private ImageView img_mainLogo;
    @FXML
    private Label lbl_home;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void lbl_home_action(MouseEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/Home.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void exitBtn(MouseEvent e) {
        /* exit */
        Platform.exit();
    }

    public void homeBtn(MouseEvent e) {
        LoginController.homeStage.show();
        EnterVisaController.thanksStage.close();
    }
    public void minBtn(MouseEvent event) {
        Stage stage = (Stage)EnterVisaController.thanksStage.getScene().getWindow();
        stage.setIconified(true);
    }
}
