package com.fcy.core;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BaseHibernateDao {
    @PersistenceContext
    private EntityManager entityManager;

}
