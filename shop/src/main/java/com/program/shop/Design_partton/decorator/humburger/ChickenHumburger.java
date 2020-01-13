package com.program.shop.Design_partton.decorator.humburger;

/**
 * 鸡腿汉堡   被修饰者实现类  相当于上面的person
 */
public class ChickenHumburger extends Humburger{
    public ChickenHumburger() {
        name="鸡腿汉堡";
    }

    @Override
    public double price() {
        return 10;
    }
}
