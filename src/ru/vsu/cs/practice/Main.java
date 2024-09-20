package ru.vsu.cs.practice;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    // Задаем цвет поля и фигуры на нем
    static final SimpleColor DEFAULT_COLOR = SimpleColor.YELLOW;
    static final Square SQUARE_1 = new Square(new int[][]{{-5, 1}, {1, 7}}, SimpleColor.GREEN);
    static final Square SQUARE_2 = new Square(new int[][]{{1, 2}, {8, 9}}, SimpleColor.WHITE);
    static final Circle CIRCLE_1 = new Circle(new int[]{-5, 2}, 3, SimpleColor.WHITE);
    static final Parabola PARABOLA_1 = new Parabola(new int[]{3, -3}, 0.5, SimpleColor.GRAY);

    public static SimpleColor getColor(double[] point) {
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

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        double[] point = new double[2];

        System.out.println("Введите абсциссу точки");
        point[0] = scanner.nextDouble();
        System.out.println("Введите ординату точки");
        point[1] = scanner.nextDouble();

        if ((-10 > point[0]) || (point[0] > 10)) {
            System.out.println("X вне допустимых значений");
            System.exit(1);
        }
        if ((-10 > point[1]) || (point[1] > 10)) {
            System.out.println("Y вне допустимых значений");
            System.exit(1);
        }

        SimpleColor ansColor = getColor(point);

        switch (ansColor) {
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
}
