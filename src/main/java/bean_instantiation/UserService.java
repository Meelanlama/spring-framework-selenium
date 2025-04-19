package bean_instantiation;

import org.springframework.stereotype.Component;

@Component
public class UserService{
    private EmailService emailService;
    private LoggingService loggingService;

    public UserService(EmailService emailService, LoggingService loggingService) {
        this.emailService = emailService;
        this.loggingService = loggingService;

        System.out.println("UserService is created with other class needed.." );
        System.out.println(emailService);
        System.out.println(loggingService);
    }

    public UserService() {
        System.out.println("UserService created");
    }
}
