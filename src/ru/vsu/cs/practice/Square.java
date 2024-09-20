package ru.vsu.cs.practice;

public class Square {
    private final Point LD_POINT; // левая нижняя точка
    private final Point RU_POINT; // правая верхняя точка
    private final SimpleColor COLOR;

    public Square(Point[] point, SimpleColor color) {
        this.LD_POINT = point[0];
        this.RU_POINT = point[1];
        this.COLOR = color;
    }

    public SimpleColor getColor() {
        return COLOR;
    }

    public boolean isInside(Point point) {
        if ((RU_POINT.x >= point.x) && (point.x >= LD_POINT.x)) {
            return (RU_POINT.y >= point.y) && (point.x >= LD_POINT.x);
        }
        return false;
    }
}