/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class profile implements Initializable {
    static Stage offers_stage = new Stage();
    static Stage special_offer_stage = new Stage();
    static Stage contact_stage = new Stage();
    private double xOffset;
    private double yOffset;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/offers.fxml"));
            Scene scene = new Scene(parent, 1920, 1080);
            parent.setOnMousePressed(ev -> {
                xOffset = offers_stage.getX() - ev.getScreenX();
                yOffset = offers_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                offers_stage.setX(ev.getScreenX() + xOffset);
                offers_stage.setY(ev.getScreenY() + yOffset);
            });
            offers_stage.setScene(scene);
            offers_stage.setTitle("offers");
            offers_stage.getIcons().add(new Image("images/logo.png"));
            offers_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println("error in offers stage" + e);
        }

        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/make_an_order.fxml"));
            Scene scene = new Scene(parent, 1920, 1080);
            parent.setOnMousePressed(ev -> {
                xOffset = special_offer_stage.getX() - ev.getScreenX();
                yOffset = special_offer_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                special_offer_stage.setX(ev.getScreenX() + xOffset);
                special_offer_stage.setY(ev.getScreenY() + yOffset);
            });
            special_offer_stage.setScene(scene);
            special_offer_stage.setTitle("special order");
            special_offer_stage.getIcons().add(new Image("images/logo.png"));
            special_offer_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println("error in make an order stage" + e);
        }

        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/contact_us.fxml"));
            Scene scene = new Scene(parent, 1920, 1080);
            parent.setOnMousePressed(ev -> {
                xOffset = contact_stage.getX() - ev.getScreenX();
                yOffset = contact_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                contact_stage.setX(ev.getScreenX() + xOffset);
                contact_stage.setY(ev.getScreenY() + yOffset);
            });
            contact_stage.setScene(scene);
            contact_stage.setTitle("contacts");
            contact_stage.getIcons().add(new Image("images/logo.png"));
            contact_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println("error in contact stage" + e);
        }

    }

    @FXML
    private void offers(ActionEvent event) {
        offers_stage.show();
        main_page.profile_stage.close();
    }

    @FXML
    private void make_an_order(ActionEvent event) {
        special_offer_stage.show();
        main_page.profile_stage.close();
    }

    @FXML
    private void lbl_contactUs_action(MouseEvent event) {
        contact_stage.show();
        main_page.profile_stage.close();
    }

    @FXML
    public void exit(MouseEvent e) {
        Platform.exit();
    }

    @FXML
    public void back(MouseEvent e) {
        Main.main_page_stage.show();
        main_page.profile_stage.close();
    }

    public void minimize(MouseEvent event) {
        Stage stage = (Stage) main_page.profile_stage.getScene().getWindow();
        stage.setIconified(true);
    }
    public void contact_us(MouseEvent mouseEvent) {
        main_page.contact_us_stage.show();
    }
}
