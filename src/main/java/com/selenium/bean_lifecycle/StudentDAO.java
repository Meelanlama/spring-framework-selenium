package com.selenium.bean_lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.sql.*;

public class StudentDAO {

    private String url;
    private String userName;
    private String password;

    //my connection object
    Connection conn;

    public void setUserName(String userName) {
        System.out.println("Setting name");
        this.userName = userName;
    }

    public void setPassword(String password) {
        System.out.println("Setting password");
        this.password = password;
    }

    public void setUrl(String url) {
        System.out.println("Setting url");
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public String getUrl() {
        return url;
    }

    //@PostConstruct
    public void init() throws ClassNotFoundException, SQLException {
        System.out.println("Inside custom init method");
        createStudentConnection();
    }

    public void createStudentConnection() throws ClassNotFoundException, SQLException {

        System.out.println("inside createStudentConnection method");
        //loading driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //get a connection
        conn = DriverManager.getConnection(url, userName, password);
    }

    public void selectAllRows() throws Exception{

        System.out.println("Retrieving all rows from database");

        //creating statement
        Statement stmt = conn.createStatement();

        String select_sql = "select * from studentinfo";

        //execute query
       ResultSet rs = stmt.executeQuery(select_sql);

       while (rs.next()) {
           int studentid = rs.getInt(1);
           String studentName = rs.getString(2);
           int fee = rs.getInt(3);
           String foodType = rs.getString(4);

           System.out.println(studentid + "," + studentName + "," + fee + "," + foodType);
       }
    }

    public void deleteStudentRecord(int studentid) throws Exception{

        //creating statement
        Statement stmt = conn.createStatement();

        String delete_sql = "DELETE from studentinfo where student_id = " + studentid;

        int rows_affected = stmt.executeUpdate(delete_sql);

        if (rows_affected > 0) {
            System.out.println("Student deleted successfully");
        }else {
            System.out.println("Student deletion failed");
        }
    }

    public void closeStudentConnection() throws SQLException {
        //used for cleanup
        conn.close();
    }

   // @PreDestroy
    public void destroy() throws SQLException {
        System.out.println("Destroying connection");
        closeStudentConnection();
    }
}
