package ru.sber.OOP2;

import java.util.Scanner;
public class BoxDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону квадрата");
        int storona = scanner.nextInt();
        Box box = new Box(storona);

        System.out.println("Площадь квадрата " + box.area());
        System.out.println("Периметр квадрата " + box.perimeter());
        System.out.print(box.draw());
        System.out.println();
        System.out.println(box.draw(Color.Pink));

    }
}
