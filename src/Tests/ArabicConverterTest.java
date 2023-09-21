package Tests;

import Katas.ArabicConverter;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArabicConverterTest {
    @Test
    public void testConvertToRoman() throws Exception {
        assertEquals("", ArabicConverter.convertToRoman(0));
        assertEquals("I", ArabicConverter.convertToRoman(1));
        assertEquals("II", ArabicConverter.convertToRoman(2));
        assertEquals("IV", ArabicConverter.convertToRoman(4));
        assertEquals("V", ArabicConverter.convertToRoman(5));
        assertEquals("X", ArabicConverter.convertToRoman(10));
        assertEquals("XXIII", ArabicConverter.convertToRoman(23));
        assertEquals("L", ArabicConverter.convertToRoman(50));
        assertEquals("LX", ArabicConverter.convertToRoman(60));
        assertEquals("CXXIII", ArabicConverter.convertToRoman(123));
        assertEquals("CCC", ArabicConverter.convertToRoman(300));
        assertEquals("CCCL", ArabicConverter.convertToRoman(350));
        assertEquals("CD", ArabicConverter.convertToRoman(400));
        assertEquals("DCCCXC", ArabicConverter.convertToRoman(890));
        assertEquals("CM", ArabicConverter.convertToRoman(900));
        assertEquals("MXCVIII", ArabicConverter.convertToRoman(1098));
        assertEquals("MCMXCIV", ArabicConverter.convertToRoman(1994));
        assertEquals("MMMMMMMMMM", ArabicConverter.convertToRoman(10000));
        assertEquals("MMMMMMMMMMMMMMMMMMMMMMMCMLXXXVIII", ArabicConverter.convertToRoman(23988));

    }
    @Test
    public void testConvertToRomanErrorHandlingNegative() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> {
            ArabicConverter.convertToRoman(-1);
        });
        String expectedMessage = "Unable to convert to Roman";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


}