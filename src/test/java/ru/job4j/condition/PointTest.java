package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2.0;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        int x1 = -1, y1 = -1, x2 = 1, y2 = 1;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double expected = 2.83;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        int x1 = -2, y1 = -2, x2 = 2, y2 = 2;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double expected = 5.66;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints02And34Then3Dot60() {
        int x1 = 0, y1 = 2, x2 = 3, y2 = 4;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double expected = 3.60;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints0Minus2And34Then6Dot71() {
        int x1 = 0, y1 = -2, x2 = 3, y2 = 4;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double expected = 6.71;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}