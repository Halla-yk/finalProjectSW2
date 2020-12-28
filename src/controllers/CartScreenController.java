/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static java.lang.Integer.max;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.concurrent.ThreadLocalRandom;
import models.CartModel;
import models.OrderModel;
import models.ProductModel;

/**
 * FXML Controller class
 *
 * @author hala
 */
public class CartScreenController  extends Controller implements Initializable{

    @FXML
    private TableView<ProductModel> tableView;
    @FXML
    private TableColumn<ProductModel, Integer> tcCartId;
    @FXML
    private TableColumn<ProductModel, Integer> tcQuantity;
    @FXML
    private TableColumn<ProductModel, String> tcCategory;
    @FXML
    private TableColumn<ProductModel, Integer> tcSalary;
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
    CartModel cm;
    OrderModel om;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         try {
             cm = (CartModel) super.ff.getModel("cart model");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
         tableView.getSelectionModel().selectedItemProperty().addListener(
                event-> showSelectedItem() );
    
           this.tcCartId.setCellValueFactory(new PropertyValueFactory("id"));
         this.tcQuantity.setCellValueFactory(new PropertyValueFactory("quantity"));
         this.tcCategory.setCellValueFactory(new PropertyValueFactory("category"));
         this.tcSalary.setCellValueFactory(new PropertyValueFactory("salary"));
    }    

    @FXML
    private void backButtonHandle(ActionEvent event) throws Exception{
        super.displayScreen(event,"Login.fxml");
    }

    @FXML
    private void showButtonHandle(ActionEvent event) throws Exception{
       ArrayList<ProductModel> pm =  cm.getCartItems();
        tableView.getItems().clear();
        int counter = 0;
        for(ProductModel p : pm){      
            tableView.getItems().add(p);
        }
    }

    @FXML
    private void addToCartButtonHandle(ActionEvent event) throws Exception{
        if(ItemIdTx !=null && ItemQuantityTx!=null){}
        cm.addToCart(ItemIdTx.getText());
    }

    @FXML
    private void deleteFromcartHandle(ActionEvent event) throws Exception{
          if(ItemIdTx !=null && ItemQuantityTx!=null){}
        cm.deleteFromCart(ItemIdTx.getText());
    }

    @FXML
    private void buyButtonHandle(ActionEvent event) throws Exception{
        int id = ThreadLocalRandom.current().nextInt(1, 50 + 1);
       LocalDateTime dateTime = LocalDateTime.now();
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-DD");
        om.makeOrder(id, dateTime.format(formatter),dateTime.format(formatter)+10, 0,cm.getTotalPrice());
        
    }
    private void showSelectedItem(){
      ProductModel product = (ProductModel) tableView.getSelectionModel().getSelectedItem();
        if(product != null){
        ItemIdTx.setText(String.valueOf(product.getId()));
        ItemQuantityTx.setText(String.valueOf(product.getQuantity()));
       
        
        }
    }
    
}
