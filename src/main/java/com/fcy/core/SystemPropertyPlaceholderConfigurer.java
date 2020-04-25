package com.fcy.core;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.Enumeration;
import java.util.Properties;

public class SystemPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
    private static Logger logger=Logger.getLogger(SystemPropertyPlaceholderConfigurer.class);


    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props) throws BeansException {
        super.processProperties(beanFactoryToProcess, props);
        logger.info("自定义属性处理器开始处理属性!");
        Enumeration<Object> keys = props.keys();
        while (keys.hasMoreElements()){
            Object o = keys.nextElement();
            if(o.equals("password")){
                logger.info(props.getProperty(o.toString()));
            }
        }
        logger.info("自定义属性处理器处理完成!");
    }
}
