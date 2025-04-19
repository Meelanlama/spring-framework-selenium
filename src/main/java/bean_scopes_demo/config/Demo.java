package bean_scopes_demo.config;

import bean_scopes_demo.service.AuthenticationService;
import bean_scopes_demo.service.CacheManager;
import bean_scopes_demo.service.EmailService;
import bean_scopes_demo.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        //getting bean from the classes
        AuthenticationService authenticationService = applicationContext.getBean(AuthenticationService.class);

        UserService userService = applicationContext.getBean(UserService.class);

        //checking if we are injecting same CacheManager object
        System.out.println(authenticationService.getCacheManager());
        System.out.println(userService.getCacheManager());

    }
}
