package beginner._1037_interval;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntervalTest {

    @Test
    void test() {
        String input = "25,01";
        String expected = "Intervalo (25,50]";
        assertEquals(expected, new Interval().solution(input));
    }

}