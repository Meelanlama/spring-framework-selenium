package bean_scopes_demo.RequestScope;

import bean_scopes_demo.config.ApplicationConfiguration;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@ComponentScan(basePackages = {"bean_scopes_demo.model","bean_scopes_demo.controller1"})
public class ScopeDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScopeDemoApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean mvc2(){
        // Creating Web Application Context
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        // Register configuration class
        webApplicationContext.register(ApplicationConfiguration.class);

        // Create and initialize DispatcherServlet with application context
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

        // Register DispatcherServlet
        DispatcherServletRegistrationBean servletRegistrationBean =
                new DispatcherServletRegistrationBean(dispatcherServlet, "/second/*");

        servletRegistrationBean.setName("second");

        return servletRegistrationBean;
    }
}

