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
    ArrayList<ProductModel> p = new ArrayList<ProductModel>();
       private Statement aStatement;
    DBConnectionSingleton aDbConnection = DBConnectionSingleton.getDbConnection();
 
    
    public int getTotalPrice(){
        int totalPrice = 0;
        for(ProductModel pp :p){
           totalPrice+= pp.getPrice();
        }
        return totalPrice;
    }
    
    public ArrayList<ProductModel> getCartItems() throws Exception{
      ResultSet rs = this.aStatement.executeQuery("Select * From product");
        int counter = 0;
        while(rs.next()){
            ProductModel pp = new ProductModel();
            pp.setCategory(rs.getString("category"));
            pp.setId(rs.getInt("id"));
            pp.setQuantity(rs.getInt("quantity"));
            pp.setPrice(rs.getInt("salary"));
            this.p.add(pp);
        
    }
        return p;
     
}
    public void addToCart(String productId) throws Exception{
     ResultSet rs = this.aStatement.executeQuery("Select * From product where id = "+productId);
        int counter = 0;
        while(rs.next()){
            ProductModel pp = new ProductModel();
            pp.setCategory(rs.getString("category"));
            pp.setId(rs.getInt("id"));
            pp.setQuantity(rs.getInt("quantity"));
            pp.setPrice(rs.getInt("salary"));
            this.p.add(pp);
        
    }
    }
    public void deleteFromCart(String productId) throws Exception{
         ResultSet rs = this.aStatement.executeQuery("Select * From product where id = "+productId);
        int counter = 0;
        while(rs.next()){
            ProductModel pp = new ProductModel();
            pp.setCategory(rs.getString("category"));
            pp.setId(rs.getInt("id"));
            pp.setQuantity(rs.getInt("quantity"));
            pp.setPrice(rs.getInt("salary"));
            this.p.remove(pp);
        
    }
    }

}
