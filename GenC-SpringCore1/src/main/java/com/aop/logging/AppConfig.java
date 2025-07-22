package com.aop.logging;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// Spring configuration class
@Configuration
@ComponentScan(basePackages = "com.aop.logging") // Scans the package for components
@EnableAspectJAutoProxy // Enables Spring AOP proxy support
public class AppConfig {
}
