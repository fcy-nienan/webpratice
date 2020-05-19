package com.fcy;

import org.hibernate.dialect.MySQLDialect;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.type.StringType;

public class CustomerMysqlDialect extends MySQLDialect {
    public CustomerMysqlDialect(){
        super.registerFunction("convert",new SQLFunctionTemplate(StringType.INSTANCE,"convert(?1 using ?2)"));
    }
}
