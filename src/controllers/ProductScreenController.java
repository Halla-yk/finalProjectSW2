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
import models.ProductModel;

/**
 * FXML Controller class
 *
 * @author hala
 */
public class ProductScreenController extends Controller implements Initializable {

    @FXML
    private TableView<ProductModel> tableView;
    @FXML
    private TableColumn<ProductModel, Integer> tcProductId;
    @FXML
    private TableColumn<ProductModel, String> tcCategory;
    @FXML
    private TableColumn<ProductModel, Integer> tcSalary;
    @FXML
    private Button backButton;
    @FXML
    private Button showButton;
    @FXML
    private Button addToCart;
    @FXML
    private Button next;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonHandle(ActionEvent event) {
    }

    @FXML
    private void showButtonHandle(ActionEvent event) {
    }

    @FXML
    private void sortByDateHandle(ActionEvent event) {
    }

    @FXML
    private void addButtonHandle(ActionEvent event) {
    }
    
}
