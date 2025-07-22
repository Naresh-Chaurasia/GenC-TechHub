package com.springbeans3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLifecycle {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        LifecycleBean bean1 = context.getBean(LifecycleBean.class);

        bean1.performAction();

        // Perform operations with the bean

        // Destroy the application context
        context.close();
    }
}