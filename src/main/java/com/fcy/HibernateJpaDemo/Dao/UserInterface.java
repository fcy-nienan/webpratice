package com.fcy.HibernateJpaDemo.Dao;

import com.fcy.HibernateJpaDemo.Model.User;
import org.springframework.data.repository.Repository;

import java.util.List;
public interface UserInterface extends Repository<User,Integer> {
    List<User> findByUsername(String username);
}
