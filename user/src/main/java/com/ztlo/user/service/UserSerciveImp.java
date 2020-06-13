package com.ztlo.user.service;

import com.ztlo.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserSerciveImp implements  UserService{

    @Autowired
    private UserDao userDao;


    @Override
    public List<Map<String, Object>> selectById() {
        return userDao.selectById();
    }
}
