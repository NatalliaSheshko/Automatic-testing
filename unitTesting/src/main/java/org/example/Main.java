package org.example;

import java.util.Scanner;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        if (!sc.hasNextInt() && sc.hasNext()) {
            System.out.println("Необходимо ввести целое число");
        }
        int a = sc.nextInt();

        System.out.println("Введите число 2: ");
        if (!sc.hasNextInt() && sc.hasNext()) {
            System.out.println("Необходимо ввести целое число");
        }
        int b = sc.nextInt();

        System.out.println("Введите число 3: ");
        if (!sc.hasNextInt() && sc.hasNext()) {
            System.out.println("Необходимо ввести целое число");
        }
        int c = sc.nextInt();

        Triangle triangle = new Triangle(a, b, c);

    }
}




