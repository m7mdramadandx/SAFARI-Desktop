/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author shima
 */
public class RegisterController implements Initializable {
    static Stage homeStage1 = new Stage();
    private double xOffset;
    private double yOffset;

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
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/home.fxml"));
            Scene scene = new Scene(parent, 1366, 728);
            parent.setOnMousePressed(ev -> {
                xOffset = homeStage1.getX() - ev.getScreenX();
                yOffset = homeStage1.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                homeStage1.setX(ev.getScreenX() + xOffset);
                homeStage1.setY(ev.getScreenY() + yOffset);
            });
            homeStage1.setScene(scene);
            homeStage1.setTitle("Home");
            homeStage1.getIcons().add(new Image("images/logo.png"));
            homeStage1.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {

        }
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
        try{

            String fname=tf_fName.getText();
            String lname=tf_lNmae.getText();
            String email=tf_email.getText();
            String password=tf_password.getText();
            String phone=tf_phoneNum.getText();

            connectionDB c = new connectionDB();
            Connection con=c.getConnection();

            PreparedStatement p=con.prepareStatement(" insert into user (first_name, last_name, email,phone,password) values ( ?,?,?,?,?)");
            p.setString(1,fname);
            p.setString(2,lname);
            p.setString(3,email);
            p.setString(4,phone);
            p.setString(5,password);

            p.executeUpdate();

            System.out.println(fname);
        }catch (Exception e){
            System.out.println("hhhhhhhh");
        }
        homeStage1.show();
        LoginController.signupStage.close();
    }

    @FXML
    private void tf_confirmPaswd_action(ActionEvent event) {

    }

    @FXML
    private void lbl_login_action(MouseEvent event) {
        LoginController.signupStage.close();
        Main.loginStage.show();
    }

    public void  exitBtn(MouseEvent e){
        Platform.exit();
    }

    @FXML
    public void  backBtn(MouseEvent e){
        LoginController.homeStage.close();
        Main.loginStage.show();
    }
    public void minBtn(MouseEvent event) {
        Stage stage = (Stage)LoginController.signupStage.getScene().getWindow();
        stage.setIconified(true);
    }
}
