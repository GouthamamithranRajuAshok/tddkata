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
}
