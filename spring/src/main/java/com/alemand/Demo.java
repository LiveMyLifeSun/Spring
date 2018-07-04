package com.alemand;

import com.alemand.entity.TestAware;
import com.alemand.entity.User;
import com.alemand.entity.init.TestInit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * <p>
 * 类说明
 * </p>
 *
 * @author Alemand
 * @since 2018/3/19
 */
public class Demo {

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestInit test = (TestInit) classPathXmlApplicationContext.getBean("test");
        System.out.println(test.getName());



    }
}
