/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.ResultSet;
import models.OrderModel;

/**
 *
 * @author hala
 */
public interface Strategy {
public ResultSet getOrder(int data);    
}
