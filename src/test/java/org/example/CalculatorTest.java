package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {

        //arrange
        Calculator calculator = new Calculator();

        //act
        double result = calculator.add(3,4);

        //assert
        assertEquals(7, result);
    }
}