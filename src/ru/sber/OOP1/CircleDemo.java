package ru.sber.OOP1;
import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        System.out.print("Введите радиус круга");
        Scanner in = new Scanner(System.in);
        int rad = in.nextInt();

        System.out.print("Введите цвет круга");
        String ColorCircle = in.next();


        Circle circle = new Circle(rad, ColorCircle);

        System.out.format("Площадь: %f \n", circle.area());
        System.out.format("Периметр: %f\n", circle.perimeter());

        System.out.println(circle);
    }
}
