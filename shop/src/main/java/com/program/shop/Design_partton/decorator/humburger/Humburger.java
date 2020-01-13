package com.program.shop.Design_partton.decorator.humburger;

/**
 * 汉堡基类  被装饰者  相当于上面的human
 */
public abstract class Humburger {
    public String name;
    public abstract double price();

    public String getName() {
        return name;
    }


}
