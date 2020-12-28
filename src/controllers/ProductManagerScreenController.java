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
public class ProductManagerScreenController implements Initializable {

    @FXML
    private TextField idTx;
    @FXML
    private TextField categoryTx;
    @FXML
    private TextField salaryTx;
    @FXML
    private TableView<?> tableView;
    @FXML
    private TableColumn<?, ?> tcId;
    @FXML
    private TableColumn<?, ?> tcCategory;
    @FXML
    private TableColumn<?, ?> tcSalary;
    @FXML
    private Button addButton;
    @FXML
    private Button updateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button nextPageButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addHandle(ActionEvent event) {
    }

    @FXML
    private void updateHandle(ActionEvent event) {
    }

    @FXML
    private void deleteHandle(ActionEvent event) {
    }

    @FXML
    private void nextPageHandle(ActionEvent event) {
    }
    
}
