/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db.java;

import oracle.jdbc.OracleDriver;
import com.db.java.Database;
import java.sql.Connection;
import java.sql.DriverManager;


public class Database {
    public String url="jdbc:mysql://localhost:3306/dbo_product?zeroDateTimeBehavior=convertToNull [root on Default schema]";
     public String user="root";
     public String pass="";
    
    
    public Connection ConnectDb() {
        try {
            DriverManager.registerDriver(new OracleDriver());
            Connection con = DriverManager.getConnection(url, user, pass);
            if (con != null) {
                return con;
            }
        } catch (Exception e) {
            e.printStackTrace() ;

        }
        return null;

    }

}
