package com.alemand.entity;

import org.springframework.beans.factory.FactoryBean;

/**
 * <p>
 * 类说明
 * </p>
 *
 * @author Alemand
 * @since 2018/5/14
 */
public class CarFactoryBean implements FactoryBean<Car> {

    private String carInfo;

    public Car getObject() throws Exception {
        Car car = new Car();
        String[] infos = carInfo.split(",");
        car.setBrand(infos[0]);
        car.setMaxSpeed(Integer.valueOf(infos[1]));
        car.setPrice(Double.valueOf(infos[2]));
        return car;
    }

    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return false;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }
}
