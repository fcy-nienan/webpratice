package com.fcy.Dao;

import com.fcy.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;
@org.springframework.stereotype.Repository
public interface UserInterface extends Repository<User,Integer> {
    @Query(nativeQuery=true,value="select * from User a order by convert(username using gbk) desc")
    List<User> getAllUser();
}
