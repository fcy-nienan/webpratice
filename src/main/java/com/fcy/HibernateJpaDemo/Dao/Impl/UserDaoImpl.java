package com.fcy.HibernateJpaDemo.Dao.Impl;

import com.fcy.HibernateJpaDemo.core.BaseHibernateDao;
import com.fcy.HibernateJpaDemo.Dao.UserInterface;
import com.fcy.HibernateJpaDemo.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserDaoImpl extends BaseHibernateDao implements UserInterface {
    @Autowired
    public UserInterface userinterface;
    public List<User> findByUsername(String username) {
        return userinterface.findByUsername(username);
    }
}
