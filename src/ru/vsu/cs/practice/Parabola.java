package ru.vsu.cs.practice;

public class Parabola {
    private final Point ZERO_POINT;
    private final double MULTIPLIER;
    private final  SimpleColor COLOR;

    public Parabola(Point zeroPoint, double multiplier, SimpleColor color) {
        this.ZERO_POINT = zeroPoint;
        this.MULTIPLIER = multiplier;
        this.COLOR = color;
    }

    public SimpleColor getColor() {
        return COLOR;
    }

    public boolean isInside(Point point) {
        return (Math.pow(point.y-ZERO_POINT.y,2)) <= (-2*MULTIPLIER*(point.x-ZERO_POINT.x));
    }
}