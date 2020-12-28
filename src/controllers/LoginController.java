/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import models.CustomerModel;
import models.StoreManagerModel;

/**
 * FXML Controller class
 *
 * @author hala
 */
public class LoginController extends Controller implements Initializable {

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
    CustomerModel cm ;
    StoreManagerModel sm;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    cm  =  (CustomerModel) super.ff.getModel("customer");
      sm = (StoreManagerModel) super.ff.getModel("store manager");
    }    

    @FXML
    private void adminloginHandle(ActionEvent event) throws Exception{
      
    sm.authentication(this.idTxt.getText(),this.passordTx.getText()); 
    Pane paneview2 = FXMLLoader.load(getClass().getResource("CustomerHomePage.fxml"));
        Scene scene= new Scene (paneview2);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void customerloginHandle(ActionEvent event) throws Exception {
        sm.authentication(this.idTxt.getText(),this.passordTx.getText());
        Pane paneview2 = FXMLLoader.load(getClass().getResource("StoreManager.fxml"));
        Scene scene= new Scene (paneview2);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}