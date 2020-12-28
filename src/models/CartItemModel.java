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
public class CartItemModel implements Model{
    private int quantity;
    private int pid ;

    public CartItemModel() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductModel getP() {
        return p;
    }

    public void setP(ProductModel p) {
        this.p = p;
    }
     
    
}
