package com.usingvalue6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.usingvalue6") // Scan for components in the specified package
@PropertySource("classpath:application.properties") // Load properties file
public class AppConfig {
}