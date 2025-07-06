
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class EvenCheckerTest {

    Even_Checker checker = new Even_Checker();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 0})
    void testEvenNumbers(int number) {
        assertTrue(checker.isEven(number), number + " should be even");
    }



    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void testOddNumbers(int number) {
        assertFalse(checker.isEven(number), number + " should be odd");
    }
}
