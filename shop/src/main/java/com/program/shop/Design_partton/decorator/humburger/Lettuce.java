package com.program.shop.Design_partton.decorator.humburger;

public class Lettuce extends Condiment{
    private Humburger humburger;

    public Lettuce(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public double price() {
        return humburger.price()+15.0;
    }

    @Override
    public String getName() {
        return humburger.getName()+"加生菜";
    }
}
