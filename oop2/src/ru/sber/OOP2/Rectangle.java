package ru.sber.OOP2;
public class Rectangle extends Figure {
    private double width;
    private double hight;

    public Rectangle(double width, double hight){
        this.width = width;
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return hight;
    }


    public void setHight(double hight) {
        this.hight = hight;
    }

    // square rectangle
    public double area() {
        return this.width * this.hight;
    }
    // per rectangle
    public double perimeter() {
        return 2 * (this.width + this.hight);
    }

    public String draw() {
        return this.draw(Color.Yellow);
    }

    public String draw(Color color) {
        return String.format(                "Нарисован прямоугольник со сторонами (%.2f, %.2f), с центром в точке %s и цветом %s",
                this.width, this.hight, super.getArPerPoint(), color);
    }
}
