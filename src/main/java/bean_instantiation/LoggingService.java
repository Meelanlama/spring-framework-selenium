package bean_instantiation;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = false)
public class LoggingService {

    public LoggingService() {
        System.out.println("LoggingService created");
    }
}
