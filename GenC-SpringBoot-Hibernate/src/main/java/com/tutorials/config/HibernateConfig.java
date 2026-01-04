package com.tutorials.config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import java.util.Properties;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.tutorials")
public class HibernateConfig {

    @Value("${spring.datasource.driver-class-name}")
    private String dbDriver;
    
    @Value("${spring.datasource.url}")
    private String dbUrl;
    
    @Value("${spring.datasource.username}")
    private String dbUsername;
    
    @Value("${spring.datasource.password}")
    private String dbPassword;
    
    @Value("${spring.jpa.properties.hibernate.dialect}")
    private String hibernateDialect;
    
    @Value("${spring.jpa.show-sql}")
    private String hibernateShowSql;
    
    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String hibernateHbm2ddlAuto;
    
    @Bean
    public SessionFactory sessionFactory() {
        org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
        
        // Hibernate settings from application.properties
        Properties settings = new Properties();
        settings.put(Environment.DRIVER, dbDriver);
        settings.put(Environment.URL, dbUrl);
        settings.put(Environment.USER, dbUsername);
        settings.put(Environment.PASS, dbPassword);
        settings.put(Environment.DIALECT, hibernateDialect);
        settings.put(Environment.SHOW_SQL, hibernateShowSql);
        settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        settings.put(Environment.HBM2DDL_AUTO, hibernateHbm2ddlAuto);
        
        configuration.setProperties(settings);
        
        // Add entity classes
        configuration.addAnnotatedClass(com.tutorials.model.User.class);
        
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
            .applySettings(configuration.getProperties()).build();
        
        return configuration.buildSessionFactory(serviceRegistry);
    }
}