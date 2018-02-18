package com.nmuzychuk;

public class Tomatoes extends PizzaDecorator {
    Tomatoes(final Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", " + "tomatoes";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
