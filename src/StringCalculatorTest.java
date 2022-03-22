import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void testAddWithEmptyString(){
        int result = StringCalculator.add("");
        assertEquals(0, result);
    }
}
