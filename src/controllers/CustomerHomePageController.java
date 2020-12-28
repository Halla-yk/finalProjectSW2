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

/**
 * FXML Controller class
 *
 * @author hala
 */
public class CustomerHomePageController extends Controller implements Initializable {

    @FXML
    private Button GoShoppingScreen;
    @FXML
    private Button GoProductPage;
    @FXML
    private Button GoCartPage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GoShoppingScreenHandle(ActionEvent event) throws Exception{
        super.displayScreen(event,"ShoppingScreen.fxml");
    }

    @FXML
    private void GoProductPageHandle(ActionEvent event) throws Exception {
          super.displayScreen(event,"ProductScreen.fxml");
    }

    @FXML
    private void GoCartPageHandle(ActionEvent event) throws Exception {
          super.displayScreen(event,"CartScreen.fxml");
    }
    
}
