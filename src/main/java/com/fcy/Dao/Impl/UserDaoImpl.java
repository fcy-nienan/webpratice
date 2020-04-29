package com.fcy.Dao.Impl;

import com.fcy.core.BaseHibernateDao;
import com.fcy.Dao.UserInterface;
import com.fcy.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserDaoImpl extends BaseHibernateDao implements UserInterface {
    @Autowired
    private UserInterface userinterface;
    public List<User> getAllUser() {
        return userinterface.getAllUser();
    }
}
