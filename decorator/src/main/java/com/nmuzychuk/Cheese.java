package com.nmuzychuk;

public class Cheese extends PizzaDecorator {
    Cheese(final Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", " + "cheese";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
