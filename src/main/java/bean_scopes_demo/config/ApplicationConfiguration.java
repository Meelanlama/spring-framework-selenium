package bean_scopes_demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"bean_scopes_demo.model","bean_scopes_demo.controller2"})
//@ComponentScan(basePackages = "bean_scopes_demo")
public class ApplicationConfiguration {
}
