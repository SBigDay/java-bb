package com.program.shop.Design_partton.decorator.humburger;

public class Chilli extends Condiment{
    Humburger humburger;

    public Chilli(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName()+"加辣椒";
    }

    @Override
    public double price() {
        return humburger.price()+20.0;
    }
}
