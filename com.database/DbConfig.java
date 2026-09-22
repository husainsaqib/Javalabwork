package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DbConfig {
	Connection con;
	PreparedStatement s;
     public DbConfig()
     {
    	 
    	 try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","saqib5a");
    	 }catch(Exception e)
    	 {
    		 System.out.println("wrong connection");
    	 }
    	 }
     public Connection getCon()
     {
    	 return con;
     }
}