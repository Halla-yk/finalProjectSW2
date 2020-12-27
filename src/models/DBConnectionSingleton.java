/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author hala
 */
public class DBConnectionSingleton {
      private Connection aConnection;
    private Statement aStatement;
    private static DBConnectionSingleton aDbConnection;
    private DBConnectionSingleton(){}
    public static DBConnectionSingleton getDbConnection(){
        if(aDbConnection == null)
            aDbConnection = new DBConnectionSingleton();
        return aDbConnection;
    }
    public Statement getStatement() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        aConnection = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/clinicsystem","","");
        aStatement = aConnection.createStatement();
        
        return aStatement;
    }
    
}
