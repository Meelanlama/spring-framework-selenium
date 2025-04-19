package com.selenium.Spring_Annotation;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("Science Teacher teaching");
    }
}
