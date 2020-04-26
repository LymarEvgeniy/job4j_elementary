package ru.job4j.condition;

import org.hamcrest.Matchers;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max check = new Max();
        int result = check.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To3Then3() {
        Max check = new Max();
        int result = check.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenEqually() {
        Max check = new Max();
        int result = check.max(3, 3);
        assertThat(result, is(3));

    }

    @Test
    public void whenSecondMax() {
        Max check = new Max();
        int result = check.max(1, 4, 2);
        assertThat(result, Matchers.is(4));
    }

    @Test
    public void whenFirstMax() {
        Max check = new Max();
        int result = check.max(5, 4, 2);
        assertThat(result, Matchers.is(5));
    }

    @Test
    public void whenThirdMax() {
        Max check = new Max();
        int result = check.max(1, 4, 6);
        assertThat(result, Matchers.is(6));
    }

    @Test
    public void whenEqual() {
        Max check = new Max();
        int result = check.max(5, 5, 5);
        assertThat(result, Matchers.is(5));
    }
    @Test
    public void whenFourthMax() {
        Max check = new Max();
        int result = check.max(4, 2, 5, 9);
        assertThat(result, Matchers.is(9));
    }
}
