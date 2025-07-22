package com.aop.auditing;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.aop.auditing")
@EnableAspectJAutoProxy
public class AppConfig {
}
