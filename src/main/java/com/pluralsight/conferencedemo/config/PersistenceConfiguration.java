package com.pluralsight.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:mariadb://maria-db.ck6oijrivoia.us-east-1.rds.amazonaws.com:3306/demo");
        builder.username("admin");
        builder.password("CVIk2BM8ZS0LNLnPLJVP");
        System.out.println("My custom datasource bean has been initialized and set");
        return builder.build();
    }
}
