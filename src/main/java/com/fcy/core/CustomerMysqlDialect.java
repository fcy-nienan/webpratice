package com.fcy.core;

import org.hibernate.Hibernate;
import org.hibernate.dialect.MySQLDialect;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StringType;

public class CustomerMysqlDialect extends MySQLDialect {
    public CustomerMysqlDialect(){
        super.registerFunction("convert",new SQLFunctionTemplate(StringType.INSTANCE,"convert(?1 using ?2)"));
    }
}
