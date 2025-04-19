package bean_instantiation;

import org.springframework.stereotype.Component;

public class EmailService {
    public EmailService() {
        System.out.println("Email Service created");
    }
}
