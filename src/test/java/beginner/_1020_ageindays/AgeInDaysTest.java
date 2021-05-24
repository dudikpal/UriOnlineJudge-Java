package beginner._1020_ageindays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeInDaysTest {

    @Test
    void test() {
        String input = "400";
        String expected = """
                1 ano(s)
                1 mes(es)
                5 dia(s)
                """;
        assertEquals(expected, new AgeInDays().solution(input));
    }

}