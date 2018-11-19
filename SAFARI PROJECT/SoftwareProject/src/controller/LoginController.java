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
import javafx.scene.control.CheckBox;
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
public class LoginController implements Initializable {

    @FXML
    private ImageView img_mainLogo;
    @FXML
    private TextField tf_userNmae;
    @FXML
    private TextField tf_password;
    @FXML
    private CheckBox check_rememberMe;
    @FXML
    private Label lbl_forgetPaswd;
    @FXML
    private Button bt_login;
    @FXML
    private ImageView img_user;
    @FXML
    private ImageView img_password;
    @FXML
    private Label lbl_signUp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File mainLogo = new File("images/mainLogo.png");
        Image mainImage = new Image(mainLogo.toURI().toString());
        img_mainLogo.setImage(mainImage);
        
        File paswdLogo = new File("images/passwordIcon.png");
        Image paswdImage = new Image(paswdLogo.toURI().toString());
        img_password.setImage(paswdImage);
        
        File userLogo = new File("images/userIcon.png");
        Image userImage = new Image(userLogo.toURI().toString());
        img_user.setImage(userImage);
    }    

    @FXML
    private void tf_userNmae_action(ActionEvent event) {
    }

    @FXML
    private void tf_password_action(ActionEvent event) {
    }

    @FXML
    private void check_rememberMe_action(ActionEvent event) {
    }

    @FXML
    private void lbl_forgetPaswd_action(MouseEvent event) {
    }

    @FXML
    private void bt_login_action(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/home.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    private void bt_signUp_action(ActionEvent event) {
//        try {
//            Parent parent = FXMLLoader.load(getClass().getResource("../View/register.fxml"));
//            Scene scene = new Scene(parent);
//            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//            stage.setScene(scene);
//            stage.show();
//        } catch (IOException ex) {
//            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    @FXML
    private void lbl_signUp_action(MouseEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/register.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
