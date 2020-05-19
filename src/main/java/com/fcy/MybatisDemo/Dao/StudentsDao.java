package com.fcy.MybatisDemo.Dao;

import com.fcy.MybatisDemo.Model.Students;

import java.util.logging.Logger;

public interface StudentsDao {
    int deleteByPrimaryKey(Integer sid);

    int insert(Students record);

    int insertSelective(Students record);

    Students selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);
}
