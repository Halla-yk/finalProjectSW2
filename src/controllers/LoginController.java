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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author hala
 */
public class LoginController implements Initializable {

    @FXML
    private TextField idTxt;
    @FXML
    private PasswordField passordTx;
    @FXML
    private Label loginLabel;
    @FXML
    private Button adminloginButton;
    @FXML
    private Button customerloginButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void adminloginHandle(ActionEvent event) {
    }

    @FXML
    private void customerloginHandle(ActionEvent event) {
    }
    
}
