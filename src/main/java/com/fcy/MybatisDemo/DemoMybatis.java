package com.fcy.MybatisDemo;

import com.fcy.MybatisDemo.Model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.logging.Logger;

public class DemoMybatis {
    private static Logger logger = Logger.getLogger(DemoMybatis.class.getName());

    public static void main(String args[]) throws Exception {
        Reader reader = Resources.getResourceAsReader("MybatisDemo/mybatis-config.xml");
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);

        SqlSession session= sessionFactory.openSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        User user= mapper.GetUserByID(1);
        System.out.println(user.toString());
    }
}
