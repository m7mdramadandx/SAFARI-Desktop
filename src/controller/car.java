package controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class car implements Initializable {
    public ImageView image1;
    public ImageView image2;
    public ImageView image3;
    public ImageView image4;
    public ImageView image5;
    public ImageView image6;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void exit(MouseEvent e) {
        offers.car_stage.close();
    }


    public void minimize(MouseEvent event) {
        Stage stage = (Stage) offers.car_stage.getScene().getWindow();
        stage.setIconified(true);
    }
}
