package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static junit.framework.Assert.assertEquals;

public class ParamTest {

    @ParameterizedTest
    @CsvSource(value = {
            "3, 3, 3, Треугольник является равносторонним",
            "3, 3, 5, Треугольник является равнобедренным",
            "3, 4, 5, Треугольник является разносторонним",
            "2, 2, 20, Числа не являются сторонами трегольника"
    })
    public void testIsTriangle(int a, int b, int c, String expected){
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(expected, triangle.isTriangle());
    }

}
