package com.program.shop.Design_partton.decorator.humburger;

public class Test {
    public static void main(String[] args) {
        Humburger humburger=new ChickenHumburger();
        System.out.println(humburger.getName()+"价格:"+humburger.price());
        Lettuce lettuce=new Lettuce(humburger);
        System.out.println(lettuce.getName()+"价格:"+lettuce.price());
        Chilli chilli=new Chilli(lettuce);
        System.out.println(chilli.getName()+"价格:"+chilli.price());
        Chilli chilli1=new Chilli(chilli);
        System.out.println(chilli1.getName()+"价格:"+chilli1.price());
        System.out.println("------------------------------------");
        Chilli chilli2=new Chilli(new Chilli(new Lettuce(new ChickenHumburger())));
        System.out.println(chilli2.getName()+"价格:"+chilli2.price());
    }
}
