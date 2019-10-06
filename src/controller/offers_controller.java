package controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class offers_controller implements Initializable {

    static Stage staff_home_stage = new Stage();
    static Stage offers_controller_stage = new Stage();
    public TableView<offer> offerTableView;
    public TextField offer_id;
    public JFXComboBox<Object> location;
    public TextField hotel_name;
    public JFXComboBox duration;
    public JFXComboBox transportation;
    public JFXComboBox rate;
    public TextField cost;
    public TableColumn c_offer_ld;
    public TableColumn c_location;
    public TableColumn c_hotel_name;
    public TableColumn c_duration;
    public TableColumn c_transportation;
    public TableColumn c_rate;
    public TableColumn c_cost;
    public Button add_offer;
    public Button confirm_offer;
    public TextField search_offer;
    public TextField delete_offer;
    public JFXComboBox xx;



    private double xOffset;
    private double yOffset;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        c_offer_ld.setCellValueFactory(new PropertyValueFactory<>("offer_id"));
        c_location.setCellValueFactory(new PropertyValueFactory<>("location"));
        c_hotel_name.setCellValueFactory(new PropertyValueFactory<>("hotel_name"));
        c_duration.setCellValueFactory(new PropertyValueFactory<>("duration"));
        c_transportation.setCellValueFactory(new PropertyValueFactory<>("transportation"));
        c_rate.setCellValueFactory(new PropertyValueFactory<>("rate"));
        c_cost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        offerTableView.setItems(get_offer_list());


    }


    public void update_offer(ActionEvent actionEvent) {
        String ooffer_id = offer_id.getText();
        String olocation = String.valueOf(location.getValue());
        String ohotel_name = hotel_name.getText();
        String oduration = String.valueOf(duration.getValue());
        String otranspotation = String.valueOf(transportation.getValue());
        String orate_ = String.valueOf(rate.getValue());
        float orate = Float.valueOf(orate_);
        int ocost = Integer.valueOf(cost.getText());
/*
        offer offer1 = new offer();
        offer1.setOffer_id(ooffer_id);
        offer1.setLocation(olocation);
        offer1.setHotel_name(ohotel_name);
        offer1.setDuration(oduration);
        offer1.setTransportation(otranspotation);
        offer1.setRate(orate);
        offer1.setCost(ocost);
        offerTableView.getItems().add(offer1);
  */

        try {
            connectionDB c = new connectionDB();
            Connection con = c.getConnection();
            String database_table = String.valueOf(xx != null ? xx.getValue() : null);
            PreparedStatement p = con.prepareStatement(" update " + database_table + " where offer_id = '" + ooffer_id + "' set (location, hotel_name, duration,transportation,rate,cost) values ( ?,?,?,?,?,?)");
            p.setString(1, ooffer_id);
            p.setString(2, olocation);
            p.setString(3, ohotel_name);
            p.setString(4, oduration);
            p.setString(5, otranspotation);
            p.setFloat(6, orate);
            p.setInt(7, ocost);
            p.executeUpdate();
            get_offer_list().removeAll();
        } catch (Exception e) {
            System.out.println("error in confirm offer method " + e);
        }
    }

    public void confirm_offer(ActionEvent actionEvent) {
        String ooffer_id = offer_id.getText();
        String olocation = String.valueOf(location.getValue());
        String ohotel_name = hotel_name.getText();
        String oduration = String.valueOf(duration.getValue());
        String otranspotation = String.valueOf(transportation.getValue());
        String orate_ = String.valueOf(rate.getValue());
        float orate = Float.valueOf(orate_);
        int ocost = Integer.valueOf(cost.getText());

        try {
            connectionDB c = new connectionDB();
            Connection con = c.getConnection();
            String database_table = String.valueOf(xx != null ? xx.getValue() : null);
            PreparedStatement p = con.prepareStatement(" insert into " + database_table + " (offer_id, location, hotel_name, duration,transportation,rate,cost) values ( ?,?,?,?,?,?,?)");
            p.setString(1, ooffer_id);
            p.setString(2, olocation);
            p.setString(3, ohotel_name);
            p.setString(4, oduration);
            p.setString(5, otranspotation);
            p.setFloat(6, orate);
            p.setInt(7, ocost);
            p.executeUpdate();
            get_offer_list().removeAll();
            show_all(actionEvent);
        } catch (Exception e) {
            System.out.println("error in confirm offer method " + e);
        }
    }

    public void search_offer(ActionEvent actionEvent) {
        try {
            connectionDB c = new connectionDB();
            Connection con = c.getConnection();
            String database_table = String.valueOf(xx != null ? xx.getValue() : null);
            PreparedStatement ps = con.prepareStatement("Select * FROM " + database_table + " where offer_id = '" + search_offer.getText() + "';");
            ResultSet result = ps.executeQuery();
            ObservableList<offer> offer1 = FXCollections.observableArrayList();
            while (result.next()) {
                offer1.add(new offer(
                        result.getString(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getString(5),
                        result.getFloat(6),
                        result.getInt(7)));
                offerTableView.setItems(offer1);
            }
            search_offer.clear();
        } catch (SQLException ex) {
            System.out.println("erro in search offer method" + ex);
        }
    }

    public void show_all(ActionEvent actionEvent) {
        try {
            connectionDB c = new connectionDB();
            Connection con = c.getConnection();
            String database_table = String.valueOf(xx != null ? xx.getValue() : null);
            PreparedStatement ps = con.prepareStatement("Select * FROM " + database_table + "");
            ResultSet result = ps.executeQuery();
            ObservableList<offer> offer1 = FXCollections.observableArrayList();
            while (result.next()) {
                offer1.add(new offer(
                        result.getString(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getString(5),
                        result.getFloat(6),
                        result.getInt(7)));
                offerTableView.setItems(offer1);
            }

        } catch (SQLException e) {
            System.out.println("erro in show all method" + e);
        }
    }

    public void delete_offer(ActionEvent actionEvent) {
        try {
            connectionDB c = new connectionDB();
            Connection con = c.getConnection();
            String database_table = String.valueOf(xx != null ? xx.getValue() : null);
            PreparedStatement ps = con.prepareStatement("Delete FROM " + database_table + " where offer_id ='" + delete_offer.getText() + "';");
            ps.executeUpdate();
            PreparedStatement ps1 = con.prepareStatement("Select * FROM " + database_table + "");
            ResultSet result = ps1.executeQuery();
            ObservableList<offer> offer1 = FXCollections.observableArrayList();
            while (result.next()) {
                offer1.add(new offer(
                        result.getString(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getString(5),
                        result.getFloat(6),
                        result.getInt(7)));
                offerTableView.setItems(offer1);
            }
            delete_offer.clear();
        } catch (SQLException e) {
            System.out.println("erro in delete all method" + e);
        }
    }

    public void clear_all(ActionEvent actionEvent) {
        offerTableView.setItems(null);
    }

    private ObservableList<offer> get_offer_list() {
        ObservableList<offer> offers = FXCollections.observableArrayList();
        return offers;
    }

    public void back(MouseEvent mouseEvent) {
        main_page.staff_home_stage.show();
        staff_home.offers_controller_stage.close();
    }

    public void minimize(MouseEvent event) {
        Stage stage = (Stage) staff_home.offers_controller_stage.getScene().getWindow();
        stage.setIconified(true);
    }

    public void exit(MouseEvent mouseEvent) {
        Platform.exit();
    }


}
