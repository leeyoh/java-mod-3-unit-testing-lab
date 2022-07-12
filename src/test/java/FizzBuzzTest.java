import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz f;

    @BeforeEach
    void setUp() {
        f  = new FizzBuzz();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fizzBuzzString(){
        String actual = f.fizzBuzzString("fish");
        assertEquals("Fizz",actual, "Testing for Lowercase f");

        actual = f.fizzBuzzString("Bomb");
        assertEquals("Buzz",actual, "Testing at End for Lowercase b");

        actual = f.fizzBuzzString("fub");
        assertEquals("FizzBuzz",actual, "Starts with F ends with B");

        actual = f.fizzBuzzString("");
        assertEquals("",actual,"empty string");
    }

    @Test
    void fizzBuzzStringNull(){
        String testString = null;
        String actual = f.fizzBuzzString(testString);
        assertNull(actual, "String is Null");
    }
}