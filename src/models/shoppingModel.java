/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class shoppingModel implements Strategy {
    String ShippingDate;
    int salary;
    
  private Statement aStatement;
    @Override
    public ResultSet getOrder(int id) {
         String sql = "select ShippingDate,salary From order Where id=" + id;
      
        ResultSet sel = null;
      try {
          sel = this.aStatement.executeQuery(sql);
      } catch (SQLException ex) {
          Logger.getLogger(shoppingModel.class.getName()).log(Level.SEVERE, null, ex);
      }
       return sel;

    }

    public void setShippingDate(String ShippingDate) {
        this.ShippingDate = ShippingDate;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
    
}
