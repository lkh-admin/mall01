package com.sr.service;

import com.sr.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public List<Map> userS() {
        List<Map> maps = userDao.selectUser();
        return maps;
    }
}
