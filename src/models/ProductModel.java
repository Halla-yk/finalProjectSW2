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
    /*   private int id;
    private String category;
    private int salary;
    */
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
