/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hala
 */
public class ProductModel implements Model{
    private int id;
    private String category;
    private int price;
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
     private Statement aStatement;
    DBConnectionSingleton aDbConnection = DBConnectionSingleton.getDbConnection();

   
    
    public void addProduct(int id, String category, int salary) throws SQLException{
    
        String sql = "Insert Into product values(" + id + ",'" +category + "','" 
                + salary + "')";
        this.aStatement.executeUpdate(sql);
        
       
}
    public void updateProduct(int id, String category, int salary) throws SQLException{
    
         String sql = "Update product Set id='" + id + "', category='" + 
                category + "', salary='" +salary+ "' Where id=" +id;
        this.aStatement.executeUpdate(sql);
        
       
}
     public void deleteProduct(int id) throws SQLException{
    
        String sql = "delete From product Where id=" +id;
        this.aStatement.executeUpdate(sql);
        
       
}
     
        
    

     
     
}
