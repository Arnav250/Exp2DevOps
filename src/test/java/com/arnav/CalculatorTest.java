package com.arnav;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private final Calculator c = new Calculator();

    @Test void addsNumbers() { assertEquals(5, c.add(2, 3)); }
    @Test void multipliesNumbers() { assertEquals(20, c.multiply(4, 5)); }
}
