/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Strategy;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import models.OrderModel;
import models.shoppingModel;

/**
 * FXML Controller class
 *
 * @author hala
 */
public class ShoppingScreenController implements Initializable {

    @FXML
    private TableView<shoppingModel> tableView;
    @FXML
    private TableColumn<shoppingModel,String> tcOrderDate;
    @FXML
    private TableColumn<shoppingModel, Integer> tcSalary;
    shoppingModel Shm;
    @FXML
    private Button showButton;
    @FXML
    private TextField IdText;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tcOrderDate.setCellValueFactory(new PropertyValueFactory("ShippingDate"));
        tcSalary.setCellValueFactory(new PropertyValueFactory("Salary"));

}


    @FXML
    private void showButtonHandle(ActionEvent event) {
          ResultSet re=Shm.getOrder(Integer.parseInt(IdText.getText()));
        try {
            while (re.next()) {
                Shm.setShippingDate(re.getString("ShippingDate"));
                Shm.setSalary(re.getInt("salary"));
                tableView.getItems().add(Shm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShoppingScreenController.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
