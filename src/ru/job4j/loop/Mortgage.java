package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        int per = (int) percent;
        while (amount > 0) {
        amount = (amount * per / 100 + amount) - salary;
        year++;
        }
        return year;
    }
}
