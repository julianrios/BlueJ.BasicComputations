import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortCalculatorTest {
    private static volatile ShortCalculator calc = new ShortCalculator();
    
    @Test
    public void testShortAddition() {
        // : Given
        short baseValue = 16384;
        short addedValue = 7;
        short expected = 16391;
        // : When
        short actual = ShortCalculator.add(baseValue, addedValue);
        // : Then
        assertEquals(expected, actual);
    }
    
     @Test
    public void testShortSubtraction() {
        // : Given
        short baseValue = 16384;
        short difference = 16383;
        short expectedShort = 1;
        // : When
        short actualShort = ShortCalculator.subtract(baseValue, difference);
        // : Then
        assertEquals(expectedShort,actualShort);
    }
    
    @Test
    public void testShortMultiplication() {
        // : Given
        short multiplicand = 2;
        short multiplier = 1;
        short expectedShort = 2;
        // : When
        short actualShort = ShortCalculator.multiply(multiplicand, multiplier);
        // : Then
        assertEquals(expectedShort, actualShort);
    }
    
    @Test
    public void testShortDivision() {
        // : Given
        short dividend = 2;
        short divisor = 1;
        short expectedShort = 2;
        // : When
        short actualShort = ShortCalculator.divide(dividend, divisor);
        // : Then
        assertEquals(expectedShort, actualShort);
    }

    @Test
    public void testShortRemainder() {
        // : Given
        short dividend = 2;
        short divisor = 1;
        short expectedShort = 0;
        // : When
        short actualShort = ShortCalculator.remainder(dividend, divisor);
        // : Then
        assertEquals(expectedShort, actualShort);
    }
}

