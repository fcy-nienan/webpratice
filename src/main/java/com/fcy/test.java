package com.fcy;

import com.fcy.HibernateJpaDemo.Dao.Impl.UserDaoImpl;
import com.fcy.HibernateJpaDemo.Model.User;
import org.eclipse.persistence.internal.jpa.EntityManagerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import java.util.List;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("JpaDemo/application-context.xml");
        int beanDefinitionCount = context.getBeanDefinitionCount();
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (int i=0;i<beanDefinitionCount;i++){
            Object bean = context.getBean(beanDefinitionNames[i]);
            System.out.println(bean.getClass().getName());
            if (bean.getClass().getName().equals("com.fcy.JpaDemo.Dao.Impl.UserDaoImpl")){
                UserDaoImpl impl= (UserDaoImpl) bean;
                System.out.println("------------------------");
                System.out.println("继承Repository接口的接口的代理对象:"+impl.userinterface.getClass().getName());
                System.out.println("---------------实现的接口--------------");
                for (Class<?> anInterface : impl.userinterface.getClass().getInterfaces()) {
                    System.out.println(anInterface.getName());
                }
                System.out.println("-----------------父类------------------");
                System.out.println(impl.userinterface.getClass().getSuperclass().getName());
                System.out.println("------------------------");
                List<User> fcy = impl.findByUsername("fcy");
                System.out.println(fcy.get(0));
            }
        }

    }
}
