package ru.sber.OOP2;

import java.util.Scanner;
public class RectangleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника");
        int dlina = scanner.nextInt();

        System.out.println("Введите ширину прямоугольника");
        int shirina = scanner.nextInt();

        Rectangle rectangle = new Rectangle(shirina, dlina);

        System.out.println("Площадь прямоугольника " + rectangle.area());
        System.out.println("Периметр прямоугольника " + rectangle.perimeter());
        System.out.println(rectangle.draw());
    }
}
