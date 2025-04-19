package com.selenium.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

       /* Student1 st = new Student1();
        MathCheat cheat = new MathCheat();
        st.setMath(cheat);
        st.cheating();
        */

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student1 st = context.getBean("stu",Student1.class);
        System.out.println("XML loaded..");
        st.studentCheating();

        AnotherStudent ast = context.getBean("anotherStudent",AnotherStudent.class);
        ast.anotherStudentCheating();

    }
}
