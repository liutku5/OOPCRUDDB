package org.example;

import org.example.models.Author;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(Author.selectAll());
        Author a =  Author.findById(1);
        System.out.println(a);
        a.setName("Marijonas");
        a.setSurname("Užlegys");
        a.update();
        a = Author.findById(1);
        System.out.println(a);
        Author.delete(8);
        Author.create("Tomas", "Kuprinskas");
    }

    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
        } catch (Exception e) {
            System.out.println("Failed to connect to database");
        }
        return connection;
    }

}