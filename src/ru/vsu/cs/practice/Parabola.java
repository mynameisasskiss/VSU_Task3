package ru.vsu.cs.practice;

public class Parabola {
    private final int[] ZERO_POINT;
    private final int MULTIPLIER;
    private final  SimpleColor COLOR;

    public Parabola(int[] zeroPoint, int multiplier, SimpleColor color) {
        this.ZERO_POINT = zeroPoint;
        this.MULTIPLIER = multiplier;
        this.COLOR = color;
    }

    public SimpleColor getColor() {
        return COLOR;
    }

    public boolean isInside(double[] point) {
        return !(point[0] > MULTIPLIER * Math.pow(point[1] - ZERO_POINT[1], 2) + ZERO_POINT[0]);
    }
}