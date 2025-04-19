package com.selenium.bean_lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {
    public static void main(String[] args) throws Exception {
//        StudentDAO dao = new StudentDAO();
//        dao.selectAllRows();
//        dao.deleteStudentRecord(5);

        //creating container object manually
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("lifecycle.xml");
        StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);
        studentDAO.selectAllRows();

        //closing the container object manually
        context.close();

            //closing via hook
//        context.registerShutdownHook();
    }
}
