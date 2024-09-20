package ru.vsu.cs.practice;

public class Circle {
    private final int[] CENTER_POINT;
    private final int RADIUS;
    private final SimpleColor COLOR;

    public Circle(int[] center, int radius, SimpleColor color) {
        this.CENTER_POINT = center;
        this.RADIUS = radius;
        this.COLOR = color;
    }
    
    public SimpleColor getColor() {
        return COLOR;
    }

    public boolean isInside(double[] point) {
        return Math.abs(point[0] - CENTER_POINT[0]) + Math.abs(point[1] - CENTER_POINT[1]) <= RADIUS;
    }
}
