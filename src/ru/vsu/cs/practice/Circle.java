package ru.vsu.cs.practice;

public class Circle {
    private Point centerPoint;
    private int radius;
    private SimpleColor color;

    public Circle(Point center, int radius, SimpleColor color) {
        this.centerPoint = center;
        this.radius = radius;
        this.color = color;
    }
    
    public SimpleColor getColor() {
        return color;
    }

    public boolean isInside(Point point) {
        return Math.pow(point.x - centerPoint.x, 2) + Math.pow(point.y - centerPoint.y, 2) <= Math.pow(radius, 2);
    }
}
