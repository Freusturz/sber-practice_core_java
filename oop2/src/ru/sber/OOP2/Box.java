package ru.sber.OOP2;

public class Box extends Rectangle{

    public Box(double side) {
        super(side, side);
    }

    public double getWidth() {
        return super.getWidth();
    }


    public void setWidth(double side) {
        super.setHight(side);
        super.setWidth(side);
    }

    public double getHeight() {
        return super.getHight();
    }


    public void setHight(double side) {
        super.setWidth(side);
        super.setHight(side);
    }

    public String draw() {
        return this.draw(Color.Black);
    }


    public double area() {
        return super.area();
    }
    public double perimeter(){
        return super.perimeter();
    }

    public String draw(Color color) {
        return String.format(
                "Нарисован квадрат со сторонами %.2f, с центром в точке %s и цветом %s",
                super.getWidth(), super.getArPerPoint(), color);
    }
}
