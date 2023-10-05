package com.mahagan.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import javax.sql.DataSource;
@Configuration
@ComponentScan("com.mahagan")
@PropertySource("application.properties")

public class ApplicationConfig {
    @Autowired
    Environment environment;// automatically inject the dependencies of environment.
    private  final  String URL="url";
    private final String USER="user";
    private final String PASSWORD="password";
    private final String DRIVER="driver";
    @Bean
    DataSource dataSource()
    {
        DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();  // driver Manager establish the connection between database and application
        driverManagerDataSource.setUrl(environment.getProperty(URL));
        driverManagerDataSource.setUsername(environment.getProperty(USER));
        driverManagerDataSource.setPassword(environment.getProperty(PASSWORD));
        driverManagerDataSource.setDriverClassName(environment.getProperty(DRIVER));
       return driverManagerDataSource;

    }

}