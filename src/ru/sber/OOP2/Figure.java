package ru.sber.OOP2;
public abstract class Figure implements Drawable {
    private Point ArPerPoint = new Point();

    public Point getArPerPoint() {
        return ArPerPoint;
    }
    public void setArPerPoint(Point ArPerPoint){
        this.ArPerPoint = ArPerPoint;
    }
    public abstract double area();
    public abstract double perimeter();
}
