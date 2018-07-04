package com.alemand.entity.init;

import org.springframework.beans.factory.InitializingBean;

/**
 * <p>
 * 类说明
 * </p>
 *
 * @author Alemand
 * @since 2018/6/1
 */
public class TestInit implements InitializingBean {

    private String name;

    public void afterPropertiesSet() throws Exception {
        name = name + "1";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
