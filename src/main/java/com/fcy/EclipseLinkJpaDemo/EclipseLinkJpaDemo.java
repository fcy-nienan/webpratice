package com.fcy.EclipseLinkJpaDemo;

import com.fcy.EclipseLinkJpaDemo.Model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EclipseLinkJpaDemo {
    public static void main(String[] args) {
//        设置persistence.xml文件的位置
        System.setProperty("eclipselink.persistencexml","SingalEclipseLinkJpaDemo/persistence.xml");
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        EntityManager em = factory.createEntityManager();
        //  为了使得对象的创建成为一个事务来提交，我们通过em.getTransaction().begin(); em.getTransaction().commit();这两个方法来完成整个数据插入的过程。
        em.getTransaction().begin();
        User user=new User(3,"nienan","nienan");
        em.persist(user);
        em.getTransaction().commit();
    }
}
