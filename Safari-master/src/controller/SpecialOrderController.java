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
import javafx.scene.control.ChoiceBox;
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
public class SpecialOrderController implements Initializable {
    static Stage visaStage= new Stage();
    private double xOffset;
    private double yOffset;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/EnterVisa.fxml"));
            Scene scene = new Scene(parent, 1366, 728);
            parent.setOnMousePressed(ev -> {
                xOffset = visaStage.getX() - ev.getScreenX();
                yOffset = visaStage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                visaStage.setX(ev.getScreenX() + xOffset);
                visaStage.setY(ev.getScreenY() + yOffset);
            });
            visaStage.setScene(scene);
            visaStage.setTitle("Payment");
            visaStage.getIcons().add(new Image("images/maps-and-flags (2).png"));
            visaStage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {

        }
    }

    @FXML
    private void combobox_place_action(MouseEvent event) {
    }
    @FXML
    private void combobox_days_action(MouseEvent event) {
    }

    @FXML
    private void combobox_transport_action(MouseEvent event) {
    }

    @FXML
    private void combobox_stars_action(MouseEvent event) {
    }

    @FXML
    private void combobox_people_action(MouseEvent event) {
    }

    @FXML
    private void bt_submit_action(ActionEvent event) {
        visaStage.show();
        HomeController.specialofferStage.close();
    }

    @FXML
    public void  exitBtn(MouseEvent e){
        //exit the current platform
        Platform.exit();
    }

    @FXML
    public void  backBtn(MouseEvent e){
        //back to the previous page
        HomeController.offerStage.close();
        LoginController.homeStage.show();
    }
    public void minBtn(MouseEvent event) {
        //minimize the page
        Stage stage = (Stage)HomeController.specialofferStage.getScene().getWindow();
        stage.setIconified(true);
    }
}
    

