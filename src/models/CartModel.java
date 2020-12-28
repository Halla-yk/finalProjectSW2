/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author hala
 */
public class CartModel implements Model{
    private int totalPrice;
    ArrayList<CartItemModel> c = new ArrayList<CartItemModel>();
       private Statement aStatement;
    DBConnectionSingleton aDbConnection = DBConnectionSingleton.getDbConnection();
 
    
    public double getTotalSalary(){
        double totalPrice = 0;
        for(CartItemModel cc :c){
           
        }
        return totalPrice;
    }
    
    public ArrayList<CartItemModel> getCartItems() throws Exception{
      ResultSet rs = this.aStatement.executeQuery("Select * From cartItem");
        int counter = 0;
        while(rs.next()){
            CartItemModel bb = new CartItemModel();
            bb.(rs.getInt("bookId"));
            bb.setBorrowdate(rs.getString("borrowDate"));
            this.c.add(bb);
            tableView.getItems().add(bb);
            counter++;
            logFile(counter+"",bb);
        }
    }
     
}
