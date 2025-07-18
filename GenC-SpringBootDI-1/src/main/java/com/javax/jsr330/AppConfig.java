package com.javax.jsr330;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.javax.jsr330") // Scans the package for Spring components
public class AppConfig {
}