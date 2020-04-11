package controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class make_an_order implements Initializable {
    public JFXComboBox location;
    public JFXComboBox duration;
    public JFXComboBox transportation;
    public JFXComboBox rate;
    private static final Stage special_offer_stage = new Stage();
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void exit(MouseEvent mouseEvent) {
        Platform.exit();
    }

    public void back(MouseEvent mouseEvent) {
        profile.special_offer_stage.close();
        main_page.profile_stage.show();

    }

    public void minimize(MouseEvent mouseEvent) {
        Stage stage = (Stage) special_offer_stage.getScene().getWindow();
        stage.setIconified(true);
    }

    public void confirm(ActionEvent actionEvent) {
    }

    public void contact_us(MouseEvent mouseEvent) {
        main_page.contact_us_stage.show();
    }
}
