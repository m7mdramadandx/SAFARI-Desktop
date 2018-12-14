/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author shima
 */
public class LoginController implements Initializable {
    static Stage homeStage = new Stage();
    static Stage signupStage = new Stage();
    private double xOffset;
    private double yOffset;

    @FXML
    private ImageView img_mainLogo;
    @FXML
    private TextField usname;
    @FXML
    private TextField uspass;
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
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/home.fxml"));
            Scene scene = new Scene(parent, 1366, 728);
            parent.setOnMousePressed(ev -> {
                xOffset = homeStage.getX() - ev.getScreenX();
                yOffset = homeStage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                homeStage.setX(ev.getScreenX() + xOffset);
                homeStage.setY(ev.getScreenY() + yOffset);
            });
            homeStage.setScene(scene);
            homeStage.setTitle("Home");
            homeStage.getIcons().add(new Image("images/maps-and-flags (2).png"));
            homeStage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {

        }
        try{
            Parent parent = FXMLLoader.load(getClass().getResource("../View/register.fxml"));
            Scene scene = new Scene(parent,1366,728);
            parent.setOnMousePressed(ev -> {
                xOffset = signupStage.getX() - ev.getScreenX();
                yOffset = signupStage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                signupStage.setX(ev.getScreenX() + xOffset);
                signupStage.setY(ev.getScreenY() + yOffset);
            });
            signupStage.setScene(scene);
            signupStage.setTitle("Signup");
            signupStage.getIcons().add(new Image("images/maps-and-flags (2).png"));
            signupStage.initStyle(StageStyle.UNDECORATED);
        }catch (Exception e ){

        }

    }

    @FXML
    public void tf_userName_action(ActionEvent event) {
    }

    @FXML
    public void button55(MouseEvent event) throws IOException {
        System.out.println("hi");
       new  StaffController();
    }

    @FXML
    public void check_rememberMe_action(ActionEvent event) {
    }

    @FXML
    public void lbl_forgetPaswd_action(MouseEvent event) {
    }

    @FXML
    public void bt_login_action(ActionEvent event) {
        try {
            String uname =usname.getText();
            String upassword=uspass.getText();
            connectionDB c = new connectionDB();
            Connection con=c.getConnection();
            PreparedStatement preparedStatement=con.prepareStatement("select email,password from user ");
            ResultSet resultSet=preparedStatement.executeQuery();
            resultSet.next();
            System.out.println(resultSet.getString(2));
            while (resultSet.next() ) {
                if (resultSet.getString(1) == uname ) {

                    System.out.println("55");
                }
                System.out.println("222");
            }

        }catch (Exception e){
            System.out.println("113");
        }
        homeStage.show();
        Main.loginStage.close();
    }

    @FXML
    public void exitBtn(MouseEvent e) {
        /* exit */
        Platform.exit();
    }

    @FXML
    public void lbl_signUp_action(MouseEvent event) {
        signupStage.show();
        Main.loginStage.close();
    }

    public void minBtn(MouseEvent event) {
        Stage stage = (Stage) Main.loginStage.getScene().getWindow();
        stage.setIconified(true);
    }
}
