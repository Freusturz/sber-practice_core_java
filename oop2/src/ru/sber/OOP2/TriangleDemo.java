package ru.sber.OOP2;

import java.util.Scanner;

public class TriangleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны треугольника");
        double a1 = scanner.nextInt();
        double b1 = scanner.nextInt();
        double c1 = scanner.nextInt();
        Triangle triangle = new Triangle(a1, b1, c1);

        System.out.println("Площадь треугольника " + triangle.area());
        System.out.println("Периметр треугольника " + triangle.perimeter());
        System.out.println(triangle.draw());
    }
}
