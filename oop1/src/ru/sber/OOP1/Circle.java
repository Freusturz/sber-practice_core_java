package ru.sber.OOP1;

public class Circle {
    private final double radius;

    private final String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {

        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {

        return 2 * Math.PI * radius;
    }

    public String toString() {
        return String.format("{ Радиус: %.3f; Цвет: %s; Площадь: %.3f; Периметр: %.3f }",
                radius, color, area(), perimeter());
    }
}
