package controller;
import java.io.File;
import java.io.FileFilter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.scene.control.cell.PropertyValueFactory;


import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TableColumn;
import javafx.stage.FileChooser;

import javax.swing.filechooser.FileNameExtensionFilter;


public class AdminController {
    ObservableList<offer> list = FXCollections.observableArrayList();


    @FXML
    private TableView<offer> tables;
    @FXML
    private TableColumn<offer, String> of_id;

    @FXML
    private TableColumn<?, String> pa;

    @FXML
    private TableColumn<?, String> du;

    @FXML
    private TableColumn<?, String> st;

    @FXML
    private TableColumn<?, String> tr;

    @FXML
    private TableColumn<?, String> pr;

    @FXML
    void browse(MouseEvent event) {
        FileChooser fileChooser =new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("*IMAGE","jpg","gif","png"));
       File f=fileChooser.showOpenDialog(null);
        System.out.println("ffffffff");
    }


        @FXML
    void AddTable(MouseEvent event) {
        connectionDB c = new connectionDB();
        try {

            Connection con = c.getConnection();
            String commed = "select offer_id , place , duration , stars , transportation ,cost from offers ";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(commed);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                String x=(result.getString("offer_id"));
                String x2=(result.getString("place"));
                String x3=(result.getString("duration"));
                String x4=(result.getString("stars"));
                String x5=(result.getString("transportation"));
                String x6=(result.getString("cost"));

                 list.add(new offer(x,x2,x3,x4,x5,x6));
                System.out.println(new offer(x,x2,x3,x4,x5,x6).getCost());
                try {
                    of_id.setCellValueFactory(new PropertyValueFactory("offer_id"));
                    System.out.println("i am work");
                }
                catch (Exception av){
                    System.out.println(av.getClass());
                    av.printStackTrace();
                }

                System.out.println("bug");



            }

            //  offer_id.setCellValueFactory(new PropertyValueFactory<offer, String>("offer_id"));
           // palce.setCellValueFactory(new PropertyValueFactory<offer, String>("palce"));
           // Duration.setCellValueFactory(new PropertyValueFactory<offer, String>("duration"));
            //Stars.setCellValueFactory(new PropertyValueFactory<offer, String>("Stars  "));
            //Transportation.setCellValueFactory(new PropertyValueFactory<offer, String>("Transportation"));
            //Price.setCellValueFactory(new PropertyValueFactory<offer, String>("Price"));


            tables.setItems(list);
        }
        catch (Exception e ){

        }

    }




}
