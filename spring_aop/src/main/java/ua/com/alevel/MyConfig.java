package ua.com.alevel;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ua.com.alevel")
@EnableAspectJAutoProxy
public class MyConfig {
}
