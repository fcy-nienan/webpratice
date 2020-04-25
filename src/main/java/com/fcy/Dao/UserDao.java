package com.fcy.Dao;

import com.fcy.Model.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Repository
public class UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void persist(User entity) {
        this.entityManager.persist(entity);
    }

    public User search(Long id) {
        return this.entityManager.find(User.class, id);
    }

    public void remove(User entity) {
        this.entityManager.remove(entity);
    }

    public void update(User entity) {
        this.entityManager.merge(entity);
    }

}
