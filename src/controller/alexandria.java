/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class alexandria implements Initializable {

    //////////////////----THREE DAYS OFFER-----////////////////
    public Label hotel_name_3;
    public Label transportaion_label_3;
    public Label transportation_3;
    String transportation3 = null;
    public Button transportaion_type_images_3;
    public Label rate_label_3;
    public ProgressBar rate_3;
    public ImageView hotel_img1_3;
    public Label cost_3;
    public Label cost_label_3;
    public Button reserve_3;
    public Label availabilty_3;
    //////////////////----FOUR DAYS OFFER-----////////////////
    public Label hotel_name_4;
    public Label transportaion_label_4;
    public Label transportation_4;
    String transportation4 = null;
    public Button transportaion_type_images_4;
    public Label rate_label_4;
    public ProgressBar rate_4;
    public ImageView hotel_img1_4;
    public Label cost_4;
    public Label cost_label_4;
    public JFXButton reserve_44;
    public Label availabilty_4;
    //////////////////----FIVE DAYS OFFER-----////////////////
    public Label hotel_name_5;
    public Label transportaion_label_5;
    public Label transportation_5;
    String transportation5 = null;
    public Button transportaion_type_images_5;
    public Label rate_label_5;
    public ProgressBar rate_5;
    public ImageView hotel_img1_5;
    public Label cost_5;
    public Label cost_label_5;
    public Button reserve_5;
    public Label availabilty_5;
    //////////////////----SIX DAYS OFFER-----////////////////
    public Label hotel_name_6;
    public Label transportaion_label_6;
    public Label transportation_6;
    String transportation6 = null;
    public Button transportaion_type_images_6;
    public Label rate_label_6;
    public ProgressBar rate_6;
    public ImageView hotel_img1_6;
    public Label cost_6;
    public Label cost_label_6;
    public Button reserve_6;
    public Label availabilty_6;
    //////////////////----ONE WEEK DAYS OFFER-----////////////////
    public Label hotel_name_1;
    public Label transportaion_label_1;
    public Label transportation_1;
    String transportation1 = null;
    public Button transportaion_type_images_1;
    public Label rate_label_1;
    public ProgressBar rate_1;
    public ImageView hotel_img1_1;
    public Label cost_1;
    public Label cost_label_1;
    public Button reserve_1;
    public Label availabilty_1;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            connectionDB c = new connectionDB();
            Connection con = c.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("select * from alexandria where location='alexandria' and  duration='3 days' ");
            ResultSet resultSet = preparedStatement.executeQuery();
            PreparedStatement preparedStatement1 = con.prepareStatement("select * from alexandria where location='alexandria' and  duration='4 days' ");
            ResultSet resultSet1 = preparedStatement1.executeQuery();
            PreparedStatement preparedStatement2 = con.prepareStatement("select * from alexandria where location='alexandria' and  duration='5 days' ");
            ResultSet resultSet2 = preparedStatement2.executeQuery();
            PreparedStatement preparedStatement3 = con.prepareStatement("select * from alexandria where location='alexandria' and  duration='6 days' ");
            ResultSet resultSet3 = preparedStatement3.executeQuery();
            PreparedStatement preparedStatement4 = con.prepareStatement("select * from alexandria where location='alexandria' and  duration='1 week' ");
            ResultSet resultSet4 = preparedStatement4.executeQuery();
            if (resultSet.next()) {
                availabilty_3.setVisible(false);
                hotel_name_3.setText(resultSet.getString(3));
                transportation_3.setText(resultSet.getString(5));
                transportation3 = resultSet.getString(5);
                cost_3.setText(String.valueOf(resultSet.getInt(7)));

            } else {
                hotel_name_3.setVisible(false);
                transportaion_label_3.setVisible(false);
                transportation_3.setVisible(false);
                transportaion_type_images_3.setVisible(false);
                rate_label_3.setVisible(false);
                rate_3.setVisible(false);
                hotel_img1_3.setVisible(false);
                cost_3.setVisible(false);
                cost_label_3.setVisible(false);
                reserve_3.setVisible(false);
            }

            if (resultSet1.next()) {
                availabilty_4.setVisible(false);
                hotel_name_4.setText(resultSet1.getString(3));
                transportation_4.setText(resultSet1.getString(5));
                transportation4 = resultSet1.getString(5);
                cost_4.setText(String.valueOf(resultSet1.getInt(7)));

            } else {
                hotel_name_4.setVisible(false);
                transportaion_label_4.setVisible(false);
                transportation_4.setVisible(false);
                transportaion_type_images_4.setVisible(false);
                rate_label_4.setVisible(false);
                rate_4.setVisible(false);
                hotel_img1_4.setVisible(false);
                cost_4.setVisible(false);
                cost_label_4.setVisible(false);
                reserve_44.setVisible(false);
            }

            if (resultSet2.next()) {
                availabilty_5.setVisible(false);
                hotel_name_5.setText(resultSet2.getString(3));
                transportation_5.setText(resultSet2.getString(5));
                transportation5 = resultSet2.getString(5);
                cost_5.setText(String.valueOf(resultSet2.getInt(7)));

            } else {
                hotel_name_5.setVisible(false);
                transportaion_label_5.setVisible(false);
                transportation_5.setVisible(false);
                transportaion_type_images_5.setVisible(false);
                rate_label_5.setVisible(false);
                rate_5.setVisible(false);
                hotel_img1_5.setVisible(false);
                cost_5.setVisible(false);
                cost_label_5.setVisible(false);
                reserve_5.setVisible(false);
            }

            if (resultSet3.next()) {
                availabilty_6.setVisible(false);
                hotel_name_6.setText(resultSet3.getString(3));
                transportation_6.setText(resultSet3.getString(5));
                transportation6 = resultSet3.getString(5);
                cost_6.setText(String.valueOf(resultSet3.getInt(7)));

            } else {
                hotel_name_6.setVisible(false);
                transportaion_label_6.setVisible(false);
                transportation_6.setVisible(false);
                transportaion_type_images_6.setVisible(false);
                rate_label_6.setVisible(false);
                rate_6.setVisible(false);
                hotel_img1_6.setVisible(false);
                cost_6.setVisible(false);
                cost_label_6.setVisible(false);
                reserve_6.setVisible(false);
            }

            if (resultSet4.next()) {
                availabilty_1.setVisible(false);
                hotel_name_1.setText(resultSet4.getString(3));
                transportation_1.setText(resultSet4.getString(5));
                transportation1 = resultSet4.getString(5);
                cost_1.setText(String.valueOf(resultSet4.getInt(7)));

            } else {
                hotel_name_1.setVisible(false);
                transportaion_label_1.setVisible(false);
                transportation_1.setVisible(false);
                transportaion_type_images_1.setVisible(false);
                rate_label_1.setVisible(false);
                rate_1.setVisible(false);
                hotel_img1_1.setVisible(false);
                cost_1.setVisible(false);
                cost_label_1.setVisible(false);
                reserve_1.setVisible(false);
            }


        } catch (Exception ex) {
            System.out.println("error in alexandria offer_3 " + ex);
        }
    }

    //////////////////----THREE DAYS OFFER-----////////////////
    public void reserve_3(ActionEvent actionEvent) {
    }

    @FXML
    public void transportaion_type_images_3(ActionEvent actionEvent) {
        switch (transportation3) {
            case "car":
                offers.car_stage.show();
                break;
            case "minibus":
                offers.minibus_stage.show();
                break;
            case "bus":
                offers.bus_stage.show();
                break;
            case "super jet":
                offers.super_jet_stage.show();
                break;
            case "train":
                offers.train_stage.show();
                break;
        }
    }

    //////////////////----FOUR DAYS OFFER-----////////////////
    public void transportaion_type_images_4(ActionEvent actionEvent) {
        switch (transportation4) {
            case "car":
                offers.car_stage.show();
                break;
            case "minibus":
                offers.minibus_stage.show();
                break;
            case "bus":
                offers.bus_stage.show();
                break;
            case "super jet":
                offers.super_jet_stage.show();
                break;
            case "train":
                offers.train_stage.show();
                break;
        }
    }

    public void reserve_4(ActionEvent actionEvent) {
    }

    //////////////////----FIVE DAYS OFFER-----////////////////
    public void transportaion_type_images_5(ActionEvent actionEvent) {
        switch (transportation5) {
            case "car":
                offers.car_stage.show();
                break;
            case "minibus":
                offers.minibus_stage.show();
                break;
            case "bus":
                offers.bus_stage.show();
                break;
            case "super jet":
                offers.super_jet_stage.show();
                break;
            case "train":
                offers.train_stage.show();
                break;
        }
    }

    public void reserve_5(ActionEvent actionEvent) {
    }

    //////////////////----SIX DAYS OFFER-----////////////////
    public void transportaion_type_images_6(ActionEvent actionEvent) {
        switch (transportation6) {
            case "car":
                offers.car_stage.show();
                break;
            case "minibus":
                offers.minibus_stage.show();
                break;
            case "bus":
                offers.bus_stage.show();
                break;
            case "super jet":
                offers.super_jet_stage.show();
                break;
            case "train":
                offers.train_stage.show();
                break;
        }
    }

    public void reserve_6(ActionEvent actionEvent) {
    }

    //////////////////----ONE WEEK DAYS OFFER-----////////////////
    public void transportaion_type_images_1(ActionEvent actionEvent) {
        switch (transportation1) {
            case "car":
                offers.car_stage.show();
                break;
            case "minibus":
                offers.minibus_stage.show();
                break;
            case "bus":
                offers.bus_stage.show();
                break;
            case "super jet":
                offers.super_jet_stage.show();
                break;
            case "train":
                offers.train_stage.show();
                break;
        }
    }

    public void reserve_1(ActionEvent actionEvent) {
    }


    public void exit(MouseEvent mouseEvent) {
        Platform.exit();
    }

    public void back(MouseEvent mouseEvent) {
        profile.offers_stage.show();
        offers.alexandria_stage.close();
    }

    public void minimize(MouseEvent mouseEvent) {
        Stage stage = (Stage) offers.alexandria_stage.getScene().getWindow();
        stage.setIconified(true);
    }
}
    

