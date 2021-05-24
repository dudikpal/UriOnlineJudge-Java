package beginner._1019_timeconversion;

import org.junit.jupiter.api.Test;

import java.sql.Time;

import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {

    @Test
    void test() {
        String input = "556";
        String expected = "0:9:16";
        assertEquals(expected, new TimeConversion().solution(input));
    }

    @Test
    void test2() {
        String input = "140153";
        String expected = "38:55:53";
        assertEquals(expected, new TimeConversion().solution(input));
    }

}