package konf.niceguys.minmax;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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

    @Test
    void maxReturnsLeftValueBigger() {

        assertEquals(5,calc.max(5,3));
        assertEquals(7,calc.max(7,4));
    }

    @Test
    void maxReturnsRightValueBigger() {
        assertEquals(8, calc.max(7,8));
        assertEquals(10, calc.max(7,10));
    }

    @Test
    void maxReturnsValueIfGivenValueIsEqual() {
        assertEquals(18, calc.max(18,18));
        assertEquals(12, calc.max(12,12));

    }

    @Test
    void compareLhsBiggerThanRhs() {
        assertTrue(calc.compare(10,5) > 0);

    }
    @Test
    void compareLhsSmallerThanRhs() {
        assertTrue(calc.compare(5,10) < 0);

    }

    @Test
    void compareLhsEqualToRhs() {
        assertTrue(calc.compare(10,10) == 0);
        assertEquals(0,calc.compare(10,10));

    }





    // neue Testfälle


    @Test
    void credit() {

        int account = 100;

        Assertions.assertEquals(210, calc.add(100,110));
        Assertions.assertTrue(330 == calc.add(210,120));
        Assertions.assertTrue(0 == calc.add(100,100));

    }
}