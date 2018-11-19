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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author shima
 */
public class SpecialOrderController implements Initializable {

    @FXML
    private ImageView img_mainLogo;
    @FXML
    private ChoiceBox<?> choiceList_days;
    @FXML
    private ChoiceBox<?> choiceList_transport;
    @FXML
    private ChoiceBox<?> choiceList_stars;
    @FXML
    private ChoiceBox<?> choiceList_people;
    @FXML
    private Button bt_submit;
    @FXML
    private ImageView img_back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File mainLogo = new File("images/mainLogo.png");
        Image mainImage = new Image(mainLogo.toURI().toString());
        img_mainLogo.setImage(mainImage);
        
        File backLogo = new File("images/back.png");
        Image backImage = new Image(backLogo.toURI().toString());
        img_back.setImage(backImage);
    }    

    @FXML
    private void choiceList_days_action(MouseEvent event) {
    }

    @FXML
    private void choiceList_transport_action(MouseEvent event) {
    }

    @FXML
    private void choiceList_stars_action(MouseEvent event) {
    }

    @FXML
    private void choiceList_people_action(MouseEvent event) {
    }

    @FXML
    private void bt_submit_action(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/EnterVisa.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void img_back_action(MouseEvent event) {
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
    
}
