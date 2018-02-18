package com.nmuzychuk;

public class Ham extends PizzaDecorator {
    Ham(final Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", " + "ham";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
