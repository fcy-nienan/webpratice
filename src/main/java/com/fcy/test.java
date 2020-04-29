package com.fcy;

import com.fcy.Dao.Impl.UserDaoImpl;
import com.fcy.Dao.UserInterface;
import com.fcy.Model.User;
import com.fcy.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.List;

public class test {
    private static UserService userService;
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        int beanDefinitionCount = context.getBeanDefinitionCount();
        userService = context.getBean(UserService.class);
        List<User> allUser = userService.getAllUser();
        System.out.println(allUser);


    }
}
