package com.fcy.HibernateJpaDemo.Service;

import com.fcy.HibernateJpaDemo.Dao.Impl.UserDaoImpl;
import com.fcy.HibernateJpaDemo.Model.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private static Logger logger=Logger.getLogger(UserService.class);
    @Autowired
    private UserDaoImpl userDao;
    public User findByUserName(String username){
        List<User> users=userDao.findByUsername(username);
        if (users.size()>1){
            logger.warn("error user count by name :"+username+" and select first!");
        }
        if (users.size()!=0){
            return users.get(0);
        }
        return null;
    }
}
