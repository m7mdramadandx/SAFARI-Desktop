package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StaffController implements Initializable {
    static Stage homeStage = new Stage();
    static Stage signupStage = new Stage();
    private double xOffset;
    private double yOffset;

    @FXML
    private ComboBox location;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/Staff.fxml"));
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



    }
}