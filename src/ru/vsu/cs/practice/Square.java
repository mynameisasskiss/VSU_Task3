package ru.vsu.cs.practice;

public class Square {
    private final int[] LD_POINT; // левая нижняя точка
    private final int[] RU_POINT; // правая верхняя точка
    private final SimpleColor COLOR;

    public Square(int[][] data, SimpleColor color) {
        this.LD_POINT = data[0];
        this.RU_POINT = data[1];
        this.COLOR = color;
    }

    public SimpleColor getColor() {
        return COLOR;
    }

    public boolean isInside(double[] point) {
        if ((RU_POINT[0] >= point[0]) && (point[0] >= LD_POINT[0])) {
            return (RU_POINT[1] >= point[1]) && (point[1] >= LD_POINT[1]);
        }
        return false;
    }
}