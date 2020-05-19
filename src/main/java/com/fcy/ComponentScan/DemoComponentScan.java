package com.fcy.ComponentScan;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import java.lang.reflect.Field;

/*
* 如果useDefaultFilters为true,那么会有一个默认的includeFilters来处理那些被@Component,@Service等注解的bean
*
*
* */
@Configuration
@ComponentScan(basePackages = "com.fcy.ComponentScan",useDefaultFilters = false,
includeFilters = @ComponentScan.Filter(type= FilterType.CUSTOM,value = com.fcy.ComponentScan.Filter.IncludeFilter.class))
public class DemoComponentScan {
    public static void main(String[] args) throws IllegalAccessException {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(DemoComponentScan.class);
        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
            Object bean = ctx.getBean(beanDefinitionName);
            BeanDefinition beanDefinition = ctx.getBeanDefinition(beanDefinitionName);
            Class<? extends BeanDefinition> aClass = beanDefinition.getClass();
            Class<?> superclass = aClass.getSuperclass().getSuperclass();
            Field[] declaredFields = superclass.getDeclaredFields();

            for (Field declaredField : declaredFields) {
                declaredField.setAccessible(true);
                if (declaredField.getName().equals("beanClass")){
                    Object o = declaredField.get(beanDefinition);
                    System.out.println(o.getClass().getName());
                    System.out.println("是否相等:"+(o==bean));
                }
            }

        }
    }
}
