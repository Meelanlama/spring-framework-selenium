package com.selenium.assignment1;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connection {
    @Value("${mysql.url}")
    private String url;

    @Value("${mysql.name}")
    private String name;

    @Value("${mysql.password}")
    private String password;

    @Value("${mysql.driver}")
    private String driver;

    public void connect() {
        try {
            Class.forName(driver);
            System.out.println("Driver loaded");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        }

        try (Connection connection = DriverManager.getConnection(url, name, password)) {
            System.out.println("Connection established");
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }

    public void display() {
        System.out.println("Connection details: ");
        System.out.println("URL: " + url + ", Name: " + name + ", Password: " + password + ", Driver: " + driver);
    }
}
