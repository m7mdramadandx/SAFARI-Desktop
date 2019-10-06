/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;


public class main_page implements Initializable {
    static Stage profile_stage = new Stage();
    static Stage sign_up_stage = new Stage();
    static Stage staff_home_stage = new Stage();
    static Stage contact_us_stage = new Stage();
    public JFXTextField phone;
    public JFXPasswordField password;
    public Label msg;

    private double xOffset;
    private double yOffset;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/profile.fxml"));
            Scene scene = new Scene(parent, 1920, 1080);
            parent.setOnMousePressed(ev -> {
                xOffset = profile_stage.getX() - ev.getScreenX();
                yOffset = profile_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                profile_stage.setX(ev.getScreenX() + xOffset);
                profile_stage.setY(ev.getScreenY() + yOffset);
            });
            profile_stage.setScene(scene);
            profile_stage.setTitle("profile");
            profile_stage.getIcons().add(new Image("images/logo.png"));
            profile_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println("error in profile stage " + e);
        }

        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/sign_up.fxml"));
            Scene scene = new Scene(parent, 1920, 1080);
            parent.setOnMousePressed(ev -> {
                xOffset = sign_up_stage.getX() - ev.getScreenX();
                yOffset = sign_up_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                sign_up_stage.setX(ev.getScreenX() + xOffset);
                sign_up_stage.setY(ev.getScreenY() + yOffset);
            });
            sign_up_stage.setScene(scene);
            sign_up_stage.setTitle("Signup");
            sign_up_stage.getIcons().add(new Image("images/logo.png"));
            sign_up_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println("error in sign_up stage " + e);
        }
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/staff_home.fxml"));
            Scene scene = new Scene(parent, 1920, 1080);
            parent.setOnMousePressed(ev -> {
                xOffset = staff_home_stage.getX() - ev.getScreenX();
                yOffset = staff_home_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                staff_home_stage.setX(ev.getScreenX() + xOffset);
                staff_home_stage.setY(ev.getScreenY() + yOffset);
            });
            staff_home_stage.setScene(scene);
            staff_home_stage.setTitle("staff home");
            staff_home_stage.getIcons().add(new Image("images/logo.png"));
            staff_home_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println("error in staff home stage " + e);
        }
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/contact_us.fxml"));
            Scene scene = new Scene(parent, 1410, 780);
            parent.setOnMousePressed(ev -> {
                xOffset = contact_us_stage.getX() - ev.getScreenX();
                yOffset = contact_us_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                contact_us_stage.setX(ev.getScreenX() + xOffset);
                contact_us_stage.setY(ev.getScreenY() + yOffset);
            });
            contact_us_stage.setScene(scene);
            contact_us_stage.setTitle("contact us");
            contact_us_stage.getIcons().add(new Image("images/logo.png"));
            contact_us_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println("error in contact us stage " + e);
        }
    }


    @FXML
    public void login(ActionEvent event) {

        if (!phone.getText().isEmpty() && !password.getText().isEmpty()) {
            if (phone.getText().equals("admin") && password.getText().equals("admin")) {
                staff_home_stage.show();
                Main.main_page_stage.close();
            }
            try {
                connectionDB c = new connectionDB();
                Connection con = c.getConnection();
                PreparedStatement preparedStatement = con.prepareStatement("select * from user where phone=? and password=?");
                preparedStatement.setString(1, phone.getText());
                preparedStatement.setString(2, password.getText());
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    profile_stage.show();
                    Main.main_page_stage.close();
                } else {
                    msg.setText("Invalid username or password");
                    phone.setText(null);
                    password.setText(null);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            msg.setText("All fields are required");
        }
    }

    @FXML
    public void exitBtn(MouseEvent e) {
        Platform.exit();
    }

    @FXML
    public void create_an_account(ActionEvent event) {
        sign_up_stage.show();
        Main.main_page_stage.close();
    }

    public void minBtn(MouseEvent event) {
        Stage stage = (Stage) Main.main_page_stage.getScene().getWindow();
        stage.setIconified(true);
    }

    public void forget_password(MouseEvent mouseEvent) {
    }

    public void check_rememberMe_action(ActionEvent actionEvent) {
    }

    public void contact_us(MouseEvent mouseEvent) {
        contact_us_stage.show();
    }
}
