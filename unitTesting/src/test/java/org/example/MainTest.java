package org.example;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainTest {

    public Triangle triangle;

    @BeforeTest
    public void setTriangle(){
        triangle = new Triangle(0,0,0);
    }

   @Test
    public void isTriangle(){
        triangle = new Triangle(5,6,7);
        assert "Треугольник является разносторонним".equals((triangle.isTriangle()));
    }

    @Test
    public void isIsoscelesTriangle() {
        triangle = new Triangle(5,5,8);
        assert "Треугольник является равнобедренным".equals((triangle.isTriangle()));
    }

    @Test
    public void isEquilateralTriangle() {
        triangle = new Triangle(5,5,5);
        assert "Треугольник является равносторонним".equals((triangle.isTriangle()));
    }

    @Test
    public void isNotTriangle(){
        triangle = new Triangle(1, 1, 10);
        assert "Числа не являются сторонами трегольника".equals((triangle.isTriangle()));
    }
}
