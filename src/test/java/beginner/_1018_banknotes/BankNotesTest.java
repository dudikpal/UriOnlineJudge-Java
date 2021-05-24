package beginner._1018_banknotes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankNotesTest {

    @Test
    void test() {
        String input = "576";
        String expected = """
                576
                5 nota(s) de R$ 100,00
                1 nota(s) de R$ 50,00
                1 nota(s) de R$ 20,00
                0 nota(s) de R$ 10,00
                1 nota(s) de R$ 5,00
                0 nota(s) de R$ 2,00
                1 nota(s) de R$ 1,00""";
        assertEquals(expected, new BankNotes().solution(input));
    }

}