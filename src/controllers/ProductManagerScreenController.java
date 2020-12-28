/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import models.ProductModel;

/**
 * FXML Controller class
 *
 * @author hala
 */

public class ProductManagerScreenController extends Controller implements Initializable {

    @FXML
    private TextField idTx;
    @FXML
    private TextField categoryTx;
    @FXML
    private TextField salaryTx;
    @FXML
    private TableView<ProductModel> tableView;
    @FXML
    private TableColumn<ProductModel, Integer> tcId;
    @FXML
    private TableColumn<ProductModel, String> tcCategory;
    @FXML
    private TableColumn<ProductModel, Integer> tcSalary;
    @FXML
    private Button addButton;
    @FXML
    private Button updateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button nextPageButton;
ProductModel pm;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           tcId.setCellValueFactory(new PropertyValueFactory("id"));
        tcCategory.setCellValueFactory(new PropertyValueFactory("category"));
        tcSalary.setCellValueFactory(new PropertyValueFactory("salary"));
         pm  =  (ProductModel) super.ff.getModel("product");
        
    }    

    @FXML
    private void addHandle(ActionEvent event) throws SQLException {
        int id = Integer.parseInt(idTx.getText());
        String category = categoryTx.getText();
        int salary = Integer.parseInt(salaryTx.getText());
        pm.addProduct(id,category,salary);
    }

    @FXML
    private void updateHandle(ActionEvent event) throws SQLException {
         int id = Integer.parseInt(idTx.getText());
        String category = categoryTx.getText();
        int salary = Integer.parseInt(salaryTx.getText());
        pm.updateProduct(id,category,salary);
    }

    @FXML
    private void deleteHandle(ActionEvent event) throws SQLException {
        int id = Integer.parseInt(idTx.getText());
         pm.deleteProduct(id);
    }

    @FXML
    private void nextPageHandle(ActionEvent event) {
    }
    
}
