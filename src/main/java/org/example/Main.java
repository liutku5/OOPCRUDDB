package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        connect();
    }

    public static Connection connect(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        }catch (Exception e){
            System.out.println("Failed to connect to database");
        }
        return connection;
    }
}