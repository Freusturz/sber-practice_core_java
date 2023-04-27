package ru.sber.OOP2;
public class Circle extends Figure{
    private double rad;

    public Circle(double radius) {
        this.rad = radius;
    }
    public double area() {
        return Math.PI * Math.pow(this.rad, 2);
    }
    public double perimeter() {
        return 2 * Math.PI * this.rad;
    }

    public double getRadius() {
        return this.rad;
    }

    public void setRadius(double rad) {
        this.rad = rad;
    }


    public String draw() {
        return this.draw(Color.Pink);
    }


    public String draw(Color color) {
        return String.format("Нарисован круг с радиусом %.3f, с центром %s и цветом %s", this.rad, super.getArPerPoint(), color);
    }

}
