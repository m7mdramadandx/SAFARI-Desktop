/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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

import java.net.URL;
import java.util.ResourceBundle;


public class offers implements Initializable {
    static Stage alexandria_stage = new Stage();
    static Stage aswan_stage = new Stage();
    static Stage cairo_stage = new Stage();
    static Stage sharm_alsheikh_stage = new Stage();
    static Stage car_stage = new Stage();
    static Stage minibus_stage = new Stage();
    static Stage bus_stage = new Stage();
    static Stage super_jet_stage = new Stage();
    static Stage train_stage = new Stage();
    private double xOffset;
    private double yOffset;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/alexandria.fxml"));
            Scene scene = new Scene(parent, 1920, 1080);
            parent.setOnMousePressed(ev -> {
                xOffset = alexandria_stage.getX() - ev.getScreenX();
                yOffset = alexandria_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                alexandria_stage.setX(ev.getScreenX() + xOffset);
                alexandria_stage.setY(ev.getScreenY() + yOffset);
            });
            alexandria_stage.setScene(scene);
            alexandria_stage.setTitle("alexandria");
            alexandria_stage.getIcons().add(new Image("images/logo.png"));
            alexandria_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println("error in alexandria stage " + e);
        }

        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/aswan.fxml"));
            Scene scene = new Scene(parent, 1920, 1080);
            parent.setOnMousePressed(ev -> {
                xOffset = aswan_stage.getX() - ev.getScreenX();
                yOffset = aswan_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                aswan_stage.setX(ev.getScreenX() + xOffset);
                aswan_stage.setY(ev.getScreenY() + yOffset);
            });
            aswan_stage.setScene(scene);
            aswan_stage.setTitle("aswan");
            aswan_stage.getIcons().add(new Image("images/logo.png"));
            aswan_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println("error in make an order stage " + e);
        }


        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/sharm_alsheikh.fxml"));
            Scene scene = new Scene(parent, 1920, 1080);
            parent.setOnMousePressed(ev -> {
                xOffset = sharm_alsheikh_stage.getX() - ev.getScreenX();
                yOffset = sharm_alsheikh_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                sharm_alsheikh_stage.setX(ev.getScreenX() + xOffset);
                sharm_alsheikh_stage.setY(ev.getScreenY() + yOffset);
            });
            sharm_alsheikh_stage.setScene(scene);
            sharm_alsheikh_stage.setTitle("sharm al sheikh");
            sharm_alsheikh_stage.getIcons().add(new Image("images/logo.png"));
            sharm_alsheikh_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println("error in sharm stage " + e);
        }


        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/cairo.fxml"));
            Scene scene = new Scene(parent, 1920, 1080);
            parent.setOnMousePressed(ev -> {
                xOffset = cairo_stage.getX() - ev.getScreenX();
                yOffset = cairo_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                cairo_stage.setX(ev.getScreenX() + xOffset);
                cairo_stage.setY(ev.getScreenY() + yOffset);
            });
            cairo_stage.setScene(scene);
            cairo_stage.setTitle("cairo");
            cairo_stage.getIcons().add(new Image("images/logo.png"));
            cairo_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println("error in cairo stage " + e);
        }
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/car.fxml"));
            Scene scene = new Scene(parent, 1750, 940);
            parent.setOnMousePressed(ev -> {
                xOffset = car_stage.getX() - ev.getScreenX();
                yOffset = car_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                car_stage.setX(ev.getScreenX() + xOffset);
                car_stage.setY(ev.getScreenY() + yOffset);
            });
            car_stage.setScene(scene);
            car_stage.setTitle("car");
            car_stage.getIcons().add(new Image("images/logo.png"));
            car_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println("error in car stage " + e);
        }
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/minibus.fxml"));
            Scene scene = new Scene(parent, 1750, 940);
            parent.setOnMousePressed(ev -> {
                xOffset = minibus_stage.getX() - ev.getScreenX();
                yOffset = minibus_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                minibus_stage.setX(ev.getScreenX() + xOffset);
                minibus_stage.setY(ev.getScreenY() + yOffset);
            });
            minibus_stage.setScene(scene);
            minibus_stage.setTitle("minibus");
            minibus_stage.getIcons().add(new Image("images/logo.png"));
            minibus_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println("error in minibus stage " + e);
        }
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/bus.fxml"));
            Scene scene = new Scene(parent, 1750, 940);

            parent.setOnMousePressed(ev -> {
                xOffset = bus_stage.getX() - ev.getScreenX();
                yOffset = bus_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                bus_stage.setX(ev.getScreenX() + xOffset);
                bus_stage.setY(ev.getScreenY() + yOffset);
            });
            bus_stage.setScene(scene);
            bus_stage.setTitle("bus");
            bus_stage.getIcons().add(new Image("images/logo.png"));
            bus_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println("error in bus stage " + e);
        }

        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/super_jet.fxml"));
            Scene scene = new Scene(parent, 1750, 940);
            parent.setOnMousePressed(ev -> {
                xOffset = super_jet_stage.getX() - ev.getScreenX();
                yOffset = super_jet_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                super_jet_stage.setX(ev.getScreenX() + xOffset);
                super_jet_stage.setY(ev.getScreenY() + yOffset);
            });
            super_jet_stage.setScene(scene);
            super_jet_stage.setTitle("super jet");
            super_jet_stage.getIcons().add(new Image("images/logo.png"));
            super_jet_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println("error in super jet stage " + e);
        }

        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/train.fxml"));
            Scene scene = new Scene(parent, 1750, 940);
            parent.setOnMousePressed(ev -> {
                xOffset = train_stage.getX() - ev.getScreenX();
                yOffset = train_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                train_stage.setX(ev.getScreenX() + xOffset);
                train_stage.setY(ev.getScreenY() + yOffset);
            });
            train_stage.setScene(scene);
            train_stage.setTitle("train");
            train_stage.getIcons().add(new Image("images/logo.png"));
            train_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println("error in train stage " + e);
        }

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

    @FXML
    public void minimize(MouseEvent event) {
        Stage stage = (Stage) main_page.profile_stage.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    public void alexandria(ActionEvent actionEvent) {
        alexandria_stage.show();
        profile.offers_stage.close();
    }

    @FXML
    public void aswan(ActionEvent actionEvent) {
        aswan_stage.show();
        profile.offers_stage.close();
    }

    @FXML
    public void cairo(ActionEvent actionEvent) {
        cairo_stage.show();
        profile.offers_stage.close();
    }

    @FXML
    public void sharm_alsheikh(ActionEvent actionEvent) {
        sharm_alsheikh_stage.show();
        profile.offers_stage.close();
    }

    public void contact_us(MouseEvent mouseEvent) {
        main_page.contact_us_stage.show();
    }
}
