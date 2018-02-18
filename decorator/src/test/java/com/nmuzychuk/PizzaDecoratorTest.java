package com.nmuzychuk;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PizzaDecoratorTest {
    @Test
    public void testPizzaDecorator() {
        Pizza pizza = new SimplePizza();
        assertEquals("dough", pizza.getDesc());
        assertEquals(10, pizza.getPrice());

        pizza = new Tomatoes(pizza);
        assertEquals("dough, tomatoes", pizza.getDesc());
        assertEquals(12, pizza.getPrice());

        pizza = new Ham(pizza);
        assertEquals("dough, tomatoes, ham", pizza.getDesc());
        assertEquals(14, pizza.getPrice());

        pizza = new Cheese(pizza);
        assertEquals("dough, tomatoes, ham, cheese", pizza.getDesc());
        assertEquals(16, pizza.getPrice());
    }
}
