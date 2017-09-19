package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class DbController {
    SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
    
    public DbController () {
    dataSource.setDriverClass(org.h2.Driver.class);
    dataSource.setUsername("sa");
    dataSource.setUrl("jdbc:h2:mem");
    dataSource.setPassword("dsf");
    
    
    jdbcTemplate.execute("create table names(" + "id serial, name varchar(255)");
    
}
    public void add(String name){
        jdbcTemplate.update("INSERT INTO names(name) values(?)", name);
    }
}