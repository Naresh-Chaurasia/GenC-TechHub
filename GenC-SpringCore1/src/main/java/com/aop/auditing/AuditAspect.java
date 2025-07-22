package com.aop.auditing;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AuditAspect {

    private static final Logger logger = LoggerFactory.getLogger(AuditAspect.class);

    @Before("execution(* com.example..*.create*(..)) || execution(* com.example..*.update*(..)) || execution(* com.example..*.delete*(..))")
    public void auditCrudMethods(JoinPoint joinPoint) {
        logAudit(joinPoint, "CRUD operation");
    }

    private void logAudit(JoinPoint joinPoint, String operationType) {
        String method = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getSimpleName();
        Object[] args = joinPoint.getArgs();

        logger.info("AUDIT - Class: {}, Method: {}, Args: {}, Operation: {}",
                className, method, Arrays.toString(args), operationType);
    }
}
