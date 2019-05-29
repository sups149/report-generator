package com.spnd.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ConverterInfoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${sqlquery.datatype}")
    private String sql;
    public void getResult(){
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        rows.forEach(System.out::println);

    }
}
