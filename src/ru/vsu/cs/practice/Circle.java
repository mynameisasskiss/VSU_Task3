package ru.vsu.cs.practice;

public class Circle {
    private final Point CENTER_POINT;
    private final int RADIUS;
    private final SimpleColor COLOR;

    public Circle(Point center, int radius, SimpleColor color) {
        this.CENTER_POINT = center;
        this.RADIUS = radius;
        this.COLOR = color;
    }
    
    public SimpleColor getColor() {
        return COLOR;
    }

    public boolean isInside(Point point) {
        return Math.pow(point.x - CENTER_POINT.x, 2) + Math.pow(point.y - CENTER_POINT.y, 2) <= Math.pow(RADIUS, 2);
    }
}
