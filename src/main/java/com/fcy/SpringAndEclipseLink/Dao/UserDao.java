package com.fcy.SpringAndEclipseLink.Dao;

import com.fcy.SpringAndEclipseLink.core.BaseEclipseLink;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao extends BaseEclipseLink {
    List<Object[]> getAll(){
        List<Object[]> objects = nativeSql("select * from user");
        return objects;
    }
}
