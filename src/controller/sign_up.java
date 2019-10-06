package controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class sign_up implements Initializable {
    private static Stage profile_stage = new Stage();
    private double xOffset;
    private double yOffset;

    public JFXTextField full_name;
    public JFXTextField phone;
    public JFXPasswordField password;
    public JFXPasswordField confirm_password;
    public Label msg;
    public JFXTextField age;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../View/profile.fxml"));
            Scene scene = new Scene(parent, 1920, 1080);
            parent.setOnMousePressed(ev -> {
                xOffset = profile_stage.getX() - ev.getScreenX();
                yOffset = profile_stage.getY() - ev.getScreenY();
            });
            parent.setOnMouseDragged(ev -> {
                profile_stage.setX(ev.getScreenX() + xOffset);
                profile_stage.setY(ev.getScreenY() + yOffset);
            });
            profile_stage.setScene(scene);
            profile_stage.setTitle("profile");
            profile_stage.getIcons().add(new Image("images/logo.png"));
            profile_stage.initStyle(StageStyle.UNDECORATED);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @FXML
    private void confirm(ActionEvent event) {
        try {
            if (full_name.getText().isEmpty() && phone.getText().isEmpty() && password.getText().isEmpty() && age.getText().isEmpty() && confirm_password.getText().isEmpty()) {
                msg.setText("All fields are required");
            } else if (password.getText().equals(confirm_password.getText())) {
                connectionDB c = new connectionDB();
                Connection con = c.getConnection();
                PreparedStatement p = con.prepareStatement(" insert into user (full_name, age, phone,password) values ( ?,?,?,?)");
                p.setString(1, full_name.getText());
                p.setString(2, age.getText());
                p.setString(3, phone.getText());
                p.setString(4, password.getText());
                p.executeUpdate();
                profile_stage.show();
                main_page.sign_up_stage.close();
            } else {
                msg.setText("passwords are not matched");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @FXML
    private void login(MouseEvent event) {
        Main.main_page_stage.show();
        main_page.sign_up_stage.close();
    }

    public void exitBtn(MouseEvent e) {
        Platform.exit();
    }

    @FXML
    public void back(MouseEvent e) {
        Main.main_page_stage.show();
        main_page.sign_up_stage.close();
    }

    @FXML
    public void minBtn(MouseEvent event) {
        Stage stage = (Stage) main_page.sign_up_stage.getScene().getWindow();
        stage.setIconified(true);
    }

    public void contact_us(MouseEvent mouseEvent) {
        main_page.contact_us_stage.show();
    }
}
