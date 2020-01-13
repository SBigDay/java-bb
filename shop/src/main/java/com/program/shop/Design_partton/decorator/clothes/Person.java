package com.program.shop.Design_partton.decorator.clothes;

/**
 * 被修饰者
 */
public class Person implements HuMan {
    @Override
    public void wearClothes() {
        System.out.println("啥姿势呢");
    }

    @Override
    public void workToWhere() {
        System.out.println("去哪溜达呢");
    }
}
