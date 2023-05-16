package com.softtek.modelo;

public class Areas {
    static final double PI = 3.14159;

    public static double circleArea(double r) {
        return PI * r * r;
    }

    public static double rectangleArea(double b, double h) {
        return b * h;
    }
}
