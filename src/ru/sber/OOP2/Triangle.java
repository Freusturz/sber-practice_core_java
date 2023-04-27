package ru.sber.OOP2;

import java.lang.Math;
public class Triangle extends Figure{
    private double a;
    private double b;
    private  double c;
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // Формула Герона
    public double area() {
        double PolPerimeter = perimeter() / 2;

        double res = PolPerimeter;
        res *= (PolPerimeter - this.a);
        res *= (PolPerimeter - this.b);
        res *= (PolPerimeter - this.c);

        return Math.sqrt(res);
    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }

    public String draw() {
        return this.draw(Color.White);
    }

    public String draw(Color color) {
        return String.format("Нарисован треугольник со сторонами (%.2f, %.2f, %.2f), с центром в точке %s и цветом %s",
                this.a, this.b, this.c, super.getArPerPoint(), color);
    }
}
