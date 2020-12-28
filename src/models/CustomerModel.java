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
 
      public boolean authentication(String idtx,String password) throws Exception{
        Integer id  =Integer.parseInt(idtx);
        ResultSet rs = this.aStatement.executeQuery("Select * From customer");
        boolean identical = false;
        while(rs.next()){
           if( id == rs.getInt("id") && (password == rs.getString("password")) ){
               identical = true;
           
           }else{
               identical = false;
              
           }
        }
        return identical;
      }
}
