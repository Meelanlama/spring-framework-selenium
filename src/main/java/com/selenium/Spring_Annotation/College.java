package com.selenium.Spring_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {

    @Value("${college.Name}")
    private String collegeName;

    @Autowired
    private Principal principal;

    //Interface variable
    @Autowired
    //@Qualifier("scienceTeacher")
    private Teacher teacher;

// FOR constructor injection.
//    public College(Principal principal) {
//        this.principal = principal;
//    }

//    public void setPrincipal(Principal principal) {
//        this.principal = principal;
//        System.out.println("Using setter injection");
//    }
//
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }

    public void test(){
        System.out.println("CollegeBean created..");
        System.out.println("College Name: " + collegeName);
        teacher.teach();
        principal.principalInfo();
    }

}
