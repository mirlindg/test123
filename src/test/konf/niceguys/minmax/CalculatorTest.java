package konf.niceguys.minmax;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calc;

    // ALT + EINFÜGEN
    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void minReturnsLeftValueIfSmaller(){

        assertEquals(0,calc.min(0,1));
        assertEquals(1,calc.min(1,2));

    }

    @Test
    void minReturnsRightValueIfSmaller() {

        assertEquals(0, calc.min(2,0));
        assertEquals(0, calc.min(2,0));
        assertEquals(1, calc.min(2,1));

    }

    @Test
    // @DisplayName("min() returns given value if LHS and RHS are equal")
    void minRetursGivenValueIfLhsAndRhsAreEqual() {

        assertEquals(42,calc.min(42,42));
    }
}