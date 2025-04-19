package com.selenium.value_required_annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;

public class Student {
    private String name;
    private String hobby;
    private String course;

    // Constructor Injection for mandatory fields
    public Student(@Value("${student.name}") @NonNull String name, @Value("${student.course}") @NonNull String course) {
        this.name = name;
        this.course = course;
    }

    // Setter for optional field
    @Value("Football")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void displayStudentInfo(){
        System.out.println("Name: " + name);
        System.out.println("Hobby: " + hobby);
        System.out.println("Course: " + course);
    }
}
