package com.program.shop.Design_partton.decorator.clothes;

/**
 * 装饰C
 */
public class Decorator_two extends Decorator {
    public Decorator_two(HuMan huMan) {
        super(huMan);
    }
    public void goHome(){
        System.out.println("进屋咯,躺着");
    }
    public void findMap(){
        System.out.println("找map,找map,找map");
    }
    @Override
    public void wearClothes() {
        // TODO Auto-generated method stub
        super.wearClothes();
        goHome();
    }

    @Override
    public void workToWhere() {
        // TODO Auto-generated method stub
        super.workToWhere();
        findMap();
    }
}
