package com.program.shop.Design_partton.decorator.clothes;

/**
 * 装饰A
 */
public class Decorator_zero extends Decorator {
    public Decorator_zero(HuMan huMan) {
        super(huMan);
    }
    public void goHome(){
        System.out.println("进屋咯,躺爬着");
    }
    public void findMap(){
        System.out.println("找map");
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
