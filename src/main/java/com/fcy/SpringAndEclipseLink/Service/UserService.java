package com.fcy.SpringAndEclipseLink.Service;

import com.fcy.HibernateJpaDemo.Dao.Impl.UserDaoImpl;
import com.fcy.SpringAndEclipseLink.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired (required = false)
    private UserDaoImpl userDaoImpl;
}
