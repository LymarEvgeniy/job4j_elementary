package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean conditionFirst = first >= second;
        int resultOne = conditionFirst ? first : second;
        boolean conditionSecond = resultOne >= third;
        int result = conditionSecond ? resultOne : third;
        return result;
    }
}
