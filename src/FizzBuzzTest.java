import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzzGivenOne() {
        String expected = "1";
        String actual = new FizzBuzz().output(1);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzzGivenTwo() {
        String expected = "2";
        String actual = new FizzBuzz().output(2);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzzGivenFour() {
        String expected = "4";
        String actual = new FizzBuzz().output(4);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzzGivenSix() {
        String expected = "Fizz";
        String actual = new FizzBuzz().output(6);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzzGivenThree() {
        String expected = "Fizz";
        String actual = new FizzBuzz().output(3);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzzGivenNine() {
        String expected = "Fizz";
        String actual = new FizzBuzz().output(9);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzzGiven() {
        String expected = "2";
        String actual = new FizzBuzz().output(2);
        assertEquals(expected, actual);
    }
}