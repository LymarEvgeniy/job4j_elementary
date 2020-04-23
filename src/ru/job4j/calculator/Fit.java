package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(double height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(160);
        double woman = Fit.womanWeight(150);
        System.out.println("Man 160 is " + man);
        System.out.println("Woman 150 is " + woman);
    }
}