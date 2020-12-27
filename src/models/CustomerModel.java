/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hala
 */
public class CustomerModel implements Model{
        private Statement aStatement;
    DBConnectionSingleton aDbConnection = DBConnectionSingleton.getDbConnection();
    public boolean verifyCustomer(String id, String password) {
        boolean isFound = false;
        try {
            aStatement = aDbConnection.getStatement();
            String sql = "Select * From user Where username='"
                    + id + "' And password='" + password + "'";
            ResultSet rs = aStatement.executeQuery(sql);
            if (rs.next()) {
                isFound = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(DBConnectionSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isFound;
    }
}
