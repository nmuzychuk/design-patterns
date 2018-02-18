package com.nmuzychuk;

public abstract class PizzaDecorator implements Pizza {
    private Pizza pizza;

    PizzaDecorator(final Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc();
    }

    @Override
    public int getPrice() {
        return pizza.getPrice();
    }
}
