/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db.java;

import com.Beans.java.Product;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 975040402v
 */
@Named(value = "searchBean")
@SessionScoped
public class searchBean implements Serializable {

   private String SearchQuery;
   
    public ArrayList<Product> find(){
        
        try{
            Connection con= new DataBase().ConnectDb();
            if(con!=null){
                
                String sql= "select * from Product where ProName like?";
                PreparedStatement pst= con.prepareStatement(sql);
                pst.setString(1,SearchQuery);
                ResultSet rs=pst.executeQuery();
                if(rs!=null){
                    ArrayList<Product> array = null;
                    while(rs.next()){
                        Product p=new Product();
                        p.setProID(rs.getInt(1));
                        p.setProName(rs.getString(2));
                        p.setProCity(rs.getString(3));
                        p.setPrice(rs.getInt(4));
                        
                        array.add(p);
                        
                    }
                    return array;
                }
                
            }
            
            }catch (Exception e){
                e.printStackTrace();
            
        }
     return null;   
    }
            
   public String getSearchQuery(){
       return SearchQuery;
   }
   
   
   public void setSearchQuery(String SearchQuery){
       this.SearchQuery= SearchQuery;
   }
    public searchBean() {
    }

    private static class DataBase {

        public DataBase() {
        }

        private Connection ConnectDb() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
