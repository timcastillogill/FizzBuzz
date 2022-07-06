import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzzGivenOne() {
        String expected = "1";
        FizzBuzz actual = new FizzBuzz().output(1);
        assertEquals(expected, actual);
    }


}