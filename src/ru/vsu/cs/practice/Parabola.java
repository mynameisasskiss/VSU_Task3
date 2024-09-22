package ru.vsu.cs.practice;

public class Parabola {
    private final Point zeroPoint;
    private final double multiplier;
    private final SimpleColor color;

    public Parabola(Point zeroPoint, double multiplier, SimpleColor color) {
        this.zeroPoint = zeroPoint;
        this.multiplier = multiplier;
        this.color = color;
    }

    public SimpleColor getColor() {
        return color;
    }

    public boolean isInside(Point point) {
        return (Math.pow(point.y-zeroPoint.y,2)) <= (-2*multiplier*(point.x-zeroPoint.x));
    }
}