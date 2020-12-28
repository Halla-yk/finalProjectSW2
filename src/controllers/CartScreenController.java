/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author hala
 */
public class CartScreenController  extends Controller implements Initializable{

    @FXML
    private TableView<?> tableView;
    @FXML
    private TableColumn<?, ?> tcCartId;
    @FXML
    private TableColumn<?, ?> tcQuantity;
    @FXML
    private TableColumn<?, ?> tcCategory;
    @FXML
    private TableColumn<?, ?> tcSalary;
    @FXML
    private TextField ItemIdTx;
    @FXML
    private TextField ItemQuantityTx;
    @FXML
    private Button backButton;
    @FXML
    private Button showButton;
    @FXML
    private Button addTocartButton;
    @FXML
    private Button deleteFromcart;
    @FXML
    private Button buyButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void backButtonHandle(ActionEvent event) {
    }

    @FXML
    private void showButtonHandle(ActionEvent event) {
    }

    @FXML
    private void addToCartButtonHandle(ActionEvent event) {
    }

    @FXML
    private void deleteFromcartHandle(ActionEvent event) {
    }

    @FXML
    private void buyButtonHandle(ActionEvent event) {
    }
    
}
