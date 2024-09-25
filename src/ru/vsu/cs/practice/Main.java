package ru.vsu.cs.practice;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    // Задаем цвет поля и фигуры на нем
    static final SimpleColor DEFAULT_COLOR = SimpleColor.YELLOW;
    static final Square SQUARE_1 = new Square(new Point[]{new Point(-5, 1), new Point(1, 7)}, SimpleColor.GREEN);
    static final Square SQUARE_2 = new Square(new Point[]{new Point(1, 2), new Point(8, 9)}, SimpleColor.WHITE);
    static final Circle CIRCLE_1 = new Circle(new Point(-5, 2), 3, SimpleColor.WHITE);
    static final Parabola PARABOLA_1 = new Parabola(new Point(3, -3), 0.5, SimpleColor.GRAY);

    public static SimpleColor getColor(Point point) {
        System.out.printf("(%s, %s) -> ", point.x, point.y);
        if (SQUARE_1.isInside(point)) {
            return SQUARE_1.getColor();
        }
        if (SQUARE_2.isInside(point)) {
            return SQUARE_2.getColor();
        }
        if (CIRCLE_1.isInside(point)) {
            return CIRCLE_1.getColor();
        }
        if (PARABOLA_1.isInside(point)) {
            return PARABOLA_1.getColor();
        }
        return DEFAULT_COLOR;
    }

    public static void outputColor(SimpleColor color) {
        switch (color) {
            case RED -> System.out.println("Красный");
            case GREEN -> System.out.println("Зеленый");
            case YELLOW -> System.out.println("Желтый");
            case WHITE -> System.out.println("Белый");
            case GRAY -> System.out.println("Серый");
            case BLACK -> System.out.println("Черный");
            case BLUE -> System.out.println("Синий");
            case ORANGE -> System.out.println("Оранжевый");
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Point point1 = new Point(5, 0);
        Point point2 = new Point(7, 5);
        Point point3 = new Point(-7, 9);
        Point point4 = new Point(7, -5);
        Point point5 = new Point(-2, 8);
        Point point6 = new Point(3, -6);
        Point point7 = new Point(6, 9);
        Point point8 = new Point(1, 2);
        Point point9 = new Point(4, 8);
        Point point10 = new Point(-2, 5);

        outputColor(getColor(point1));

        outputColor(getColor(point2));

        outputColor(getColor(point3));

        outputColor(getColor(point4));

        outputColor(getColor(point5));

        outputColor(getColor(point6));

        outputColor(getColor(point7));

        outputColor(getColor(point8));

        outputColor(getColor(point9));

        outputColor(getColor(point10));

        Scanner scanner = new Scanner(System.in);

        Point myPoint = new Point(0, 0);

        System.out.println("Введите абсциссу точки");
        myPoint.x = scanner.nextDouble();
        System.out.println("Введите ординату точки");
        myPoint.y = scanner.nextDouble();

        if ((-10 > myPoint.x) || (myPoint.x > 10)) {
            System.out.println("X вне допустимых значений");
            System.exit(1);
        }
        if ((-10 > myPoint.y) || (myPoint.y > 10)) {
            System.out.println("Y вне допустимых значений");
            System.exit(1);
        }

        outputColor(getColor(myPoint));

    }
}
