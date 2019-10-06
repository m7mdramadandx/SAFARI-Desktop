package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.ResourceBundle;

public class staff_home implements Initializable {
    static Stage offers_controller_stage = new Stage();
    static Stage special_offer_stage = new Stage();
    static Stage staff_home_stage = new Stage();
    private double xOffset;
    private double yOffset;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/offers_controller.fxml"));
            Scene scene = new Scene(parent, 1920, 1080);
            parent.setOnMousePressed(ev -> {
                xOffset = offers_controller_stage.getX() - ev.getScreenX();
                yOffset = offers_controller_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                offers_controller_stage.setX(ev.getScreenX() + xOffset);
                offers_controller_stage.setY(ev.getScreenY() + yOffset);
            });
            offers_controller_stage.setScene(scene);
            offers_controller_stage.setTitle("offers controller");
            offers_controller_stage.getIcons().add(new Image("images/logo.png"));
            offers_controller_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/special_offer.fxml"));
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
            special_offer_stage.setTitle("special offer");
            special_offer_stage.getIcons().add(new Image("images/logo.png"));
            special_offer_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void offers_controller(ActionEvent actionEvent) {
        offers_controller_stage.show();
        main_page.staff_home_stage.close();
    }

    public void special_order(ActionEvent actionEvent) {
        special_offer_stage.show();
        main_page.staff_home_stage.close();
    }

    public void exit(MouseEvent e) {
        Platform.exit();
    }

    public void minimize(MouseEvent mouseEvent) {
        Stage stage = (Stage) main_page.staff_home_stage.getScene().getWindow();
        stage.setIconified(true);

    }

    public void back(MouseEvent mouseEvent) {
        Main.main_page_stage.show();
        main_page.staff_home_stage.close();

    }
}
