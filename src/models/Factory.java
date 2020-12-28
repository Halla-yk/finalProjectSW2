/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author hala
 */
public class Factory {
     public Model getModel(String type){
        if(type.equalsIgnoreCase("customer"))
            return new CustomerModel();
        else if(type.equalsIgnoreCase("store manager"))
            return new StoreManagerModel();
        else if(type.equalsIgnoreCase("product"))
            return new ProductModel();
         else if(type.equalsIgnoreCase("store manager"))
            return new StoreManagerModel();
        else if(type.equalsIgnoreCase("order"))
            return new OrderModel();
        else if(type.equalsIgnoreCase("cart"))
            return new CartModel();
        else
            return new OrderModel();
    }
}
