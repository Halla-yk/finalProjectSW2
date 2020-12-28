/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Statement;

/**
 *
 * @author hala
 */
public class OrderModel implements Model{
    private int id;
    private String shippingDate;
    private String dateOfOrder;
    private String dateOfArrive;
    private int customerId;
    private int totalPrice;
    private Statement aStatement;
    DBConnectionSingleton aDbConnection = DBConnectionSingleton.getDbConnection();
    public OrderModel() {
        
    }
    
    public void makeOrder(int id,String shippingDate,String dateOfOrder,int customerId,int totalPrice)throws Exception {
        String sql = "Insert Into customerorder values(" + id + ",'" +shippingDate + "','" 
                +dateOfOrder+  ",'" +dateOfArrive + "',"+customerId+","+totalPrice+" )";
        this.aStatement.executeUpdate(sql);
    
    }
}
