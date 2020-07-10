/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Beans.java;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author 975040402v
 */
@Named(value = "product")
@SessionScoped
public class Product implements Serializable {

   private int ProID;
    private String ProName;
     private String ProCity;
      private int Price;

    public int getProID() {
        return ProID;
    }

    public String getProName() {
        return ProName;
    }

    public String getProCity() {
        return ProCity;
    }

    public int getPrice() {
        return Price;
    }

    public void setProID(int ProID) {
        this.ProID = ProID;
    }

    public void setProName(String ProName) {
        this.ProName = ProName;
    }

    public void setProCity(String ProCity) {
        this.ProCity = ProCity;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }
   
      
      
      
    public Product() {
    }
    
}
