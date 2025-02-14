package org.example;

public class Triangle {

    public int a;
    public int b;
    public int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String isTriangle() {
        if (((a + b > c) && (a + c > b) && (b + c > a)) && ((a == b) && (b == c))) {
            return "Треугольник является равносторонним";
        } else if (((a + b > c) && (a + c > b) && (b + c > a)) && ((a == b) || (b == c) || (c == a))) {
            return "Треугольник является равнобедренным";
        } else if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return "Треугольник является разносторонним";
        } else {
            return "Числа не являются сторонами трегольника";
        }

    }
}

