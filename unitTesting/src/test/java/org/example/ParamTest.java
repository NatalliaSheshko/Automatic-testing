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
            "2, 2, 20, Числа не являются сторонами трегольника",
            "1, 1, 1, Треугольник является равносторонним",//min для равностороннего
            "10000, 10000, 10000, Треугольник является равносторонним",//max для равностороннего
            "2, 2, 1, Треугольник является равнобедренным",//min для равнобедренного
            "20000, 20000, 10000, Треугольник является равнобедренным",//max для равнобедренного
            "2, 3, 4, Треугольник является разносторонним",//min для разностороннего
            "7000, 5000, 10000, Треугольник является разносторонним",//max для разностороннего
            "0, 0, 0, Числа не являются сторонами трегольника",//min для не треугольника
            "1, 1, 10000, Числа не являются сторонами трегольника",//max для не треугольника

    })
    public void testIsTriangle(int a, int b, int c, String expected){
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(expected, triangle.isTriangle());
    }

}
