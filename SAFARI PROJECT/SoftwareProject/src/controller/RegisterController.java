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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author shima
 */
public class RegisterController implements Initializable {

    @FXML
    private TextField tf_fName;
    @FXML
    private TextField tf_password;
    @FXML
    private TextField tf_email;
    @FXML
    private TextField tf_lNmae;
    @FXML
    private TextField tf_phoneNum;
    @FXML
    private Button bt_signUp;
    @FXML
    private ImageView img_mainLogo;
    @FXML
    private TextField tf_confirmPaswd;
    @FXML
    private Label lbl_login;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File mainLogo = new File("images/mainLogo.png");
        Image mainImage = new Image(mainLogo.toURI().toString());
        img_mainLogo.setImage(mainImage);
    }    

    @FXML
    private void tf_fName_action(ActionEvent event) {
    }

    @FXML
    private void tf_password_action(ActionEvent event) {
    }

    @FXML
    private void tf_email_action(ActionEvent event) {
    }

    @FXML
    private void tf_lNmae_action(ActionEvent event) {
    }

    @FXML
    private void tf_phoneNum_action(ActionEvent event) {
    }


    @FXML
    private void bt_signUp_action(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/login.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//
//    private void bt_login_action(ActionEvent event) {
//        try {
//            Parent parent = FXMLLoader.load(getClass().getResource("../View/login.fxml"));
//            Scene scene = new Scene(parent);
//            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//            stage.setScene(scene);
//            stage.show();
//        } catch (IOException ex) {
//            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    @FXML
    private void tf_confirmPaswd_action(ActionEvent event) {
    }

    @FXML
    private void lbl_login_action(MouseEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/login.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
