package com.fcy;

import com.fcy.Model.User;
import com.fcy.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

public class test {
    private static UserService userService;
    private static ApplicationContext context;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("application-context.xml");

        userService = context.getBean(UserService.class);
        userService.persistStudent(new User(0,"fcy11","fcy1"));

    }
}
