package org.example;

import java.util.Scanner;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int a = sc.nextInt();
        System.out.println("Введите число 2: ");
        int b = sc.nextInt();
        System.out.println("Введите число 3: ");
        int c = sc.nextInt();

        Triangle triangle = new Triangle(a, b, c);

    }
}




