package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortingCheckTest {

    @Test
    public void whenArraySorting() {
        int[] input = {1, 2, 3, 4, 5};
        boolean result = SortingCheck.increase(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenArrayNotSorting() {
        int[] input = {1, 3, 5, 9, 7};
        boolean result = SortingCheck.increase(input);
        assertThat(result, is(false));
    }
}