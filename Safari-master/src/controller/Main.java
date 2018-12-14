package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    private double xOffset;
    private double yOffset;
    static Stage loginStage;

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/login.fxml"));
            parent.setOnMousePressed(event -> {
                xOffset = primaryStage.getX() - event.getScreenX();
                yOffset = primaryStage.getY() - event.getScreenY();
            });
            parent.setOnMouseDragged(event -> {
                primaryStage.setX(event.getScreenX() + xOffset);
                primaryStage.setY(event.getScreenY() + yOffset);
            });

            Scene scene = new Scene(parent,1366,728);
            primaryStage.setScene(scene);
            primaryStage.setTitle("login");
            primaryStage.getIcons().add(new Image("images/maps-and-flags (2).png"));
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.show();
            loginStage = primaryStage;
        } catch (IOException ex) {
            System.out.println("Error In Load");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
