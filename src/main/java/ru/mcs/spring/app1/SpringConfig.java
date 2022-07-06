package ru.mcs.spring.app1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.mcs.spring.app1")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
