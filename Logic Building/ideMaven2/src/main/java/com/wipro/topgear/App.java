package com.wipro.topgear;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

   public static void main(String args[]) {
        Connection con = null;
        Statement stmt = null;
    try {
  	    Class.forName("org.hsqldb.jdbc.JDBCDriver");
        con = DriverManager.getConnection("jdbc:hsqldb:mem:sampledb", "SA", "");
        System.out.println("Creating table in given database...");
        
        stmt = con.createStatement();
        
        String sql = "CREATE TABLE REGISTRATION " +
                     "(id INTEGER not NULL, " +
                     " first VARCHAR(255), " + 
                     " last VARCHAR(255), " + 
                     " age INTEGER, " + 
                     " PRIMARY KEY ( id ))"; 

        stmt.executeUpdate(sql);
        System.out.println("Created table in given database...");
        System.out.println("Inserting data into given table...");
        String sql1 = "INSERT INTO REGISTRATION " +
                "VALUES (100, 'Zara', 'Ali', 18)";
        stmt.executeUpdate(sql1);
        ResultSet rs =  stmt.executeQuery("select id, first, last, age from REGISTRATION");
        
        // Loop through the data and print all artist names
        while(rs.next()) {
            System.out.println("Student Record: " + rs.getString("id") + " " + rs.getString("first") + " " + rs.getString("last") + " " + rs.getString("age"));
        }
         
        // Clean up
        rs.close();
        stmt.close();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
}