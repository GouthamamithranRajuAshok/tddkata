import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void testAddWithEmptyString() {
        int result = StringCalculator.add("");
        assertEquals(0, result);
    }

    @Test
    public void testAddForSingleNumberString() {
        int result = StringCalculator.add("1");
        assertEquals(1, result);
    }

    @Test
    public void testAddForNumberStingsWithComma() {
        int result = StringCalculator.add("1,2");
        assertEquals(3, result);
    }

    @Test
    public void testAddToHandleUnknownNumberSize() {
        int result = StringCalculator.add("1,2,5,6,2,7");
        assertEquals(23, result);
    }

    @Test
    public void testAddToHandleNewLineBetweenNumbers() {
        int result = StringCalculator.add("1\n2,3");
        assertEquals(6, result);
    }

    @Test
    public void testAddToHandleMultipleDelimiters() {
        int result = StringCalculator.add("//;\n1;2");
        assertEquals(3, result);
    }
}
