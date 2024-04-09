package com.mycompany.test_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Test_db {

    public static void main(String[] args) {
     try{
         String driver = "com.mysql.cj.jdbc.Driver";
         String url = "jdbc:mysql://localhost:3306/student";
         String user = "root";
         String pass = "cesba";
         System.out.println("Java tratando de conecar");
         
     Class.forName(driver);
     Connection connection = DriverManager.getConnection(url,user,pass);
     
     System.out.println("Java conectando....");
     }catch (Exception e)
     {
     e.printStackTrace();
     }
}
}
