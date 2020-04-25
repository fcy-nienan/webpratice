package com.fcy.Service;

import com.fcy.Dao.UserDao;
import com.fcy.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Transactional
    public void persistStudent(User entity) {
        System.out.println("开始插入值");
        this.userDao.persist(entity);
    }

    public User searchStudent(Long id) {
        return this.userDao.search(id);
    }

    public void removeStudent(Long id) {
        User aux = this.searchStudent(id);
        this.userDao.remove(aux);
    }

    public void updateStudent(User entity) {
        this.userDao.update(entity);
    }

}
