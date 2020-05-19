package com.fcy.HibernateJpaDemo.core;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class BaseHibernateDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Object[]> createNativeSql(String sql){
        Query nativeQuery = entityManager.createNativeQuery(sql);
        return nativeQuery.getResultList();
    }

}
