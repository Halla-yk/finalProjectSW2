/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import models.ShippingModel;

/**
 * FXML Controller class
 *
 * @author hala
 */
public class ShippingScreenController implements Initializable {

    @FXML
    private TableView<ShippingModel> tableView;
    @FXML
    private TableColumn<ShippingModel, String> tcShippingDate;
    @FXML
    private TableColumn<ShippingModel, String> tcDateofArrive;
    @FXML
    private TableColumn<ShippingModel, String> tcCustomerName;
    @FXML
    private TableColumn<ShippingModel, Integer> tcSalary;
ShippingModel Shm;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ResultSet re=Shm.getOrder(0);
        try {
            while (re.next()) {
                Shm.setCustomerName(re.getString("CustomerName"));
                Shm.setSalary(re.getInt("salary"));
                 Shm.setDateofArrive(re.getString("DateofArrive"));
                  Shm.setShippingDate(re.getString("ShippingDate"));
                tableView.getItems().add(Shm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShoppingScreenController.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }    
    
}
