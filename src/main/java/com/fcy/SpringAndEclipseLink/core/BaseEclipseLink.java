package com.fcy.SpringAndEclipseLink.core;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class BaseEclipseLink {
    @PersistenceContext
    private EntityManager entityManager;
    protected List<Object[]> nativeSql(String sql){
        Query nativeQuery = entityManager.createNativeQuery(sql);
        return nativeQuery.getResultList();
    }
}
