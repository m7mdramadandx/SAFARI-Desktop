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
public class EnterVisaController implements Initializable {

    static Stage thanksStage = new Stage();
    private double xOffset;
    private double yOffset;
    @FXML
    private Button bt_confirm;
    @FXML
    private Label lbl_price;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/thanks.fxml"));
            Scene scene = new Scene(parent, 1366, 728);
            parent.setOnMousePressed(ev -> {
                xOffset = thanksStage.getX() - ev.getScreenX();
                yOffset = thanksStage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                thanksStage.setX(ev.getScreenX() + xOffset);
                thanksStage.setY(ev.getScreenY() + yOffset);
            });
            thanksStage.setScene(scene);
            thanksStage.setTitle("Offers");
            thanksStage.getIcons().add(new Image("images/logo.png"));
            thanksStage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {

        }
    }    

    @FXML
    private void tf_visa_action(ActionEvent event) {
    }

    @FXML
    private void bt_confirm_action(ActionEvent event) {
        thanksStage.show();
        SpecialOrderController.visaStage.close();
    }

    @FXML
    public void  exitBtn(MouseEvent e){
        Platform.exit();
    }

    @FXML
    public void  backBtn(MouseEvent e){
        SpecialOrderController.visaStage.close();
        HomeController.specialofferStage.show();
    }
    public void minBtn(MouseEvent event) {
        Stage stage = (Stage) SpecialOrderController.visaStage.getScene().getWindow();
        stage.setIconified(true);
    }
    
}
