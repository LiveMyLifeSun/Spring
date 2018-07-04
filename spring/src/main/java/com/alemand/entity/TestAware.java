package com.alemand.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * <p>
 * 类说明
 * </p>
 *
 * @author Alemand
 * @since 2018/5/28
 */
public class TestAware implements BeanFactoryAware {

    private BeanFactory beanFactory;

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void testAware(){
        User user = (User)beanFactory.getBean("user");
        System.out.println(user.getEmail());
    }
}
