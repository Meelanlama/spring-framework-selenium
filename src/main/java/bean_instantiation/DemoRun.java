package bean_instantiation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoRun {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.getBean("emailService");
        context.getBean(LoggingService.class);

        context.getBean(UserService.class);
    }
}
