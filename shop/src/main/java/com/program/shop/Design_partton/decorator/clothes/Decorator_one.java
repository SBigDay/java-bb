package com.program.shop.Design_partton.decorator.clothes;

/**
 * 装饰B
 */
public class Decorator_one extends Decorator {
    public Decorator_one(HuMan huMan) {
        super(huMan);
    }
    public void goHome(){
        System.out.println("进屋咯,坐着");
    }
    public void findMap(){
        System.out.println("找map,找Map");
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
