package ru.vsu.cs.practice;

public class Square {
    private final Point LDPoint; // левая нижняя точка
    private final Point RUPoint; // правая верхняя точка
    private final SimpleColor color;

    public Square(Point[] point, SimpleColor color) {
        this.LDPoint = point[0];
        this.RUPoint = point[1];
        this.color = color;
    }

    public SimpleColor getColor() {
        return color;
    }

    public boolean isInside(Point point) {
        if ((RUPoint.x >= point.x) && (point.x >= LDPoint.x)) {
            return (RUPoint.y >= point.y) && (point.y >= LDPoint.y);
        }
        return false;
    }
}