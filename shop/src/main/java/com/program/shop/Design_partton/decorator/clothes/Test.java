package com.program.shop.Design_partton.decorator.clothes;

public class Test {
    public static void main(String[] args) {
        HuMan p=new Person();
        Decorator decorator=new Decorator_two(new Decorator_one(new Decorator_zero(p)));
        decorator.wearClothes();
        decorator.workToWhere();
     /*   System.out.println("-----------------------------");
         Decorator decorator1=new Decorator_zero(p);
         Decorator decorator2=new Decorator_one(decorator1);
         Decorator decorator3=new Decorator_two(decorator2);
         decorator3.wearClothes();
         decorator3.workToWhere();*/
    }
}
