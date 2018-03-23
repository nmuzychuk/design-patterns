package com.nmuzychuk;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static junit.framework.TestCase.assertEquals;

public class ExpressionTest {
    @Test
    public void testExpression() {
        String expression = "2 5 8 * +";
        Deque<Expression> stack = new ArrayDeque<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            // Check if token is one-digit number
            if ("1234567890".contains(token)) {
                stack.push(new Number(Integer.parseInt(token)));
            } else {
                Expression left = stack.pop();
                Expression right = stack.pop();

                int result;

                switch (token) {
                    case "+":
                        result = new Add(left, right).interpret();
                        stack.push(new Number(result));
                        break;
                    case "*":
                        result = new Multiply(left, right).interpret();
                        stack.push(new Number(result));
                        break;
                    default:
                        throw new RuntimeException("Unsupported token");
                }
            }
        }

        assertEquals(42, stack.pop().interpret());
    }
}
