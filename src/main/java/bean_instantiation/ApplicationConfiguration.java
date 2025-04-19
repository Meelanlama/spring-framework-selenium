package bean_instantiation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = "bean_instantiation",lazyInit = true)
@Lazy
public class ApplicationConfiguration {

    @Bean
    @Lazy
    public EmailService emailService() {
        return new EmailService();
    }
}
