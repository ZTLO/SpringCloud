package com.ztlo.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Map<String,Object>> selectById (){
        String sql="select * from user where id=1";
        return   jdbcTemplate.queryForList(sql);
    }
}
