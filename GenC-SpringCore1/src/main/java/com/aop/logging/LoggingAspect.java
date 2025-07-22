package com.aop.logging;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// Aspect class for logging
@Aspect
@Component
public class LoggingAspect {

    // Advice that runs before any method in the BusinessService class
    @Before("execution(* com.aop.logging.BusinessService.*(..))")
    public void logBeforeMethodExecution() {
        System.out.println("LoggingAspect: A method in BusinessService is about to execute.");
    }
}