package ru.vsu.cs.practice;

public class Parabola {
    private final int[] ZERO_POINT;
    private final double MULTIPLIER;
    private final  SimpleColor COLOR;

    public Parabola(int[] zeroPoint, double multiplier, SimpleColor color) {
        this.ZERO_POINT = zeroPoint;
        this.MULTIPLIER = multiplier;
        this.COLOR = color;
    }

    public SimpleColor getColor() {
        return COLOR;
    }

    public boolean isInside(double[] point) {
        return (Math.pow(point[1]-ZERO_POINT[1],2)) <= (-2*MULTIPLIER*(point[0]-ZERO_POINT[0]));
    }
}