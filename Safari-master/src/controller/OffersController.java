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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class OffersController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void cairo(ActionEvent event){
        Parent parent = null;
        try {
            parent = FXMLLoader.load(getClass().getResource("../View/home.fxml"));
        Scene scene = new Scene(parent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    @FXML
    public void alexandria(MouseEvent event){
        loadUI("alexandria");
    }
    @FXML
    public void aswan(MouseEvent event){
        loadUI("aswan");
    }
    @FXML
    public void sharm(MouseEvent ev){
        try {
            Parent sh = FXMLLoader.load(getClass().getResource("../View/sharm.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadUI(String ui) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../View/"+ui+".fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void exitBtn(MouseEvent e) {
        Platform.exit();
    }

    @FXML
    public void backBtn(MouseEvent e) {
        HomeController.offerStage.close();
        LoginController.homeStage.show();
    }

    public void minBtn(MouseEvent event) {
        Stage stage = (Stage) HomeController.offerStage.getScene().getWindow();
        stage.setIconified(true);
    }


}
