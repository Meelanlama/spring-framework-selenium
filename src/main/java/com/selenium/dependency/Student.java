package com.selenium.dependency;

public class Student {
    private int studentID;
    private String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
//    public void setStudentID(int studentID) {
//        this.studentID = studentID;
//    }

    public void display() {
        System.out.println("Name: " + studentName + " and Id: " + studentID);
    }
}
