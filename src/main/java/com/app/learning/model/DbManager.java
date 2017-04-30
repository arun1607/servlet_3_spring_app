package com.app.learning.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amitshrivastava on 30/04/17.
 */
public class DbManager {


    public static List<String> getUsers() {
        List<String> names = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sakila", "root", "Techigrp@123");
            //here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from actor");
            while (rs.next())
                names.add(rs.getString("first_name"));

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return names;
    }
}
