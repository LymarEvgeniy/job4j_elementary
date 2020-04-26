package ru.job4j.condition;

import static java.lang.Math.sqrt;

public class Triangle {
    /**
     * Поле объекта first.
     */
    private Point first;
    /**
     * Поле объекта second.
     */
    private Point second;
    /**
     * Поле объекта third.
     */
    private Point third;

    /**
     * Инициализация начального состояния объекта Triangle c помощью входящих параметров.
     * @param ap начальное состояние точки а.
     * @param bp начальное состояние точки b.
     * @param cp начальное состояние точки с.
     */
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     *
     * Формула.
     *
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return Периметр.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * Формула.
     *
     * √ p *(p - ab) * (p - ac) * (p - bc)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Треугольник существует, если сумма двух сторон треугольника больше третей стороны.
     *
     * a + b > c, b + c > a, a + c > b
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return Результат существования треугольника.
     */
    private boolean exist(double a, double c, double b) {
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }
}
