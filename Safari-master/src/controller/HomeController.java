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
import javafx.stage.StageStyle;


public class HomeController implements Initializable {
    static Stage offerStage = new Stage();
    static Stage specialofferStage = new Stage();
    static Stage contactusStage = new Stage();
    private double xOffset;
    private double yOffset;

    @FXML
    private ImageView img_mainLogo;
    @FXML
    private Button bt_offers;
    @FXML
    private Button bt_orders;
    @FXML
    private Label lbl_contactUs;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/Offers.fxml"));
            Scene scene = new Scene(parent, 1366, 728);
            parent.setOnMousePressed(ev -> {
                xOffset = offerStage.getX() - ev.getScreenX();
                yOffset = offerStage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                offerStage.setX(ev.getScreenX() + xOffset);
                offerStage.setY(ev.getScreenY() + yOffset);
            });
            offerStage.setScene(scene);
            offerStage.setTitle("Offers");
            offerStage.getIcons().add(new Image("images/maps-and-flags (2).png"));
            offerStage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {

        }

        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/SpecialOrder.fxml"));
            Scene scene = new Scene(parent, 1366, 728);
            parent.setOnMousePressed(ev -> {
                xOffset = specialofferStage.getX() - ev.getScreenX();
                yOffset = specialofferStage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                specialofferStage.setX(ev.getScreenX() + xOffset);
                specialofferStage.setY(ev.getScreenY() + yOffset);
            });
            specialofferStage.setScene(scene);
            specialofferStage.setTitle("Special Orders");
            specialofferStage.getIcons().add(new Image("images/maps-and-flags (2).png"));
            specialofferStage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {

        }

        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/ContactUs.fxml"));
            Scene scene = new Scene(parent, 1366, 728);
            parent.setOnMousePressed(ev -> {
                xOffset = contactusStage.getX() - ev.getScreenX();
                yOffset = contactusStage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                contactusStage.setX(ev.getScreenX() + xOffset);
                contactusStage.setY(ev.getScreenY() + yOffset);
            });
            contactusStage.setScene(scene);
            contactusStage.setTitle("Contact US");
            contactusStage.getIcons().add(new Image("images/maps-and-flags (2).png"));
            contactusStage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {

        }

    }    

    @FXML
    private void bt_offers_action(ActionEvent event) {
        offerStage.show();
        LoginController.homeStage.close();
    }

    @FXML
    private void bt_orders_action(ActionEvent event) {
        specialofferStage.show();
        LoginController.homeStage.close();
    }

    @FXML
    private void lbl_contactUs_action(MouseEvent event) {
        contactusStage.show();
        LoginController.homeStage.close();
    }

    @FXML
    public void  exitBtn(MouseEvent e){
        Platform.exit();
    }

    @FXML
    public void  backBtn(MouseEvent e){
        LoginController.homeStage.close();
        Main.loginStage.show();
    }
    public void minBtn(MouseEvent event) {
        Stage stage = (Stage) LoginController.homeStage.getScene().getWindow();
        stage.setIconified(true);
    }
    
}
