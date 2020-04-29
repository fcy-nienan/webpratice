package com.fcy.Service;

import com.fcy.Dao.Impl.UserDaoImpl;
import com.fcy.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDaoImpl userDao;
    public List<User> getAllUser(){
        return userDao.getAllUser();
    }

}
