/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class ShippingModel implements Strategy{
    String DateofArrive;
    int salary;
    String ShippingDate;
    String CustomerName;
private Statement aStatement;
    @Override
    public ResultSet getOrder(int id) {
       String sql = "select * From order ";
      
        ResultSet sel = null;
      try {
          sel = this.aStatement.executeQuery(sql);
      } catch (SQLException ex) {
          Logger.getLogger(shoppingModel.class.getName()).log(Level.SEVERE, null, ex);
      }
       return sel;

    }

    public void setDateofArrive(String DateofArrive) {
        this.DateofArrive = DateofArrive;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setShippingDate(String ShippingDate) {
        this.ShippingDate = ShippingDate;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }
    
}
