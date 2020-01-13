package com.program.shop.Design_partton.decorator.clothes;

/**
 * 定义修饰者
 */
public abstract class Decorator implements HuMan {
    private HuMan huMan;

    public Decorator(HuMan huMan) {
        this.huMan = huMan;
    }
    public void wearClothes() {
        huMan.wearClothes();
    }

    public void workToWhere() {
        huMan.workToWhere();
    }

}
