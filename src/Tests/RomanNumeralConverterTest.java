package Tests;

import Katas.RomanNumeralConverter;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralConverterTest {
    @Test
    public void testConvertToRoman() {
        assertEquals("I", RomanNumeralConverter.convertToRoman(1));
        assertEquals("II", RomanNumeralConverter.convertToRoman(2));
        assertEquals("IV", RomanNumeralConverter.convertToRoman(4));
        assertEquals("V", RomanNumeralConverter.convertToRoman(5));
        assertEquals("X", RomanNumeralConverter.convertToRoman(10));
        assertEquals("XXIII", RomanNumeralConverter.convertToRoman(23));
        assertEquals("L", RomanNumeralConverter.convertToRoman(50));
        assertEquals("LX", RomanNumeralConverter.convertToRoman(60));
        assertEquals("CXXIII", RomanNumeralConverter.convertToRoman(123));
        assertEquals("CCC", RomanNumeralConverter.convertToRoman(300));
        assertEquals("CCCL", RomanNumeralConverter.convertToRoman(350));
        assertEquals("CD", RomanNumeralConverter.convertToRoman(400));
        assertEquals("DCCCXC", RomanNumeralConverter.convertToRoman(890));
        assertEquals("CM", RomanNumeralConverter.convertToRoman(900));
        assertEquals("MXCVIII", RomanNumeralConverter.convertToRoman(1098));
        assertEquals("MCMXCIV", RomanNumeralConverter.convertToRoman(1994));
        assertEquals("MMMMMMMMMM", RomanNumeralConverter.convertToRoman(10000));
        assertEquals("MMMMMMMMMMMMMMMMMMMMMMMCMLXXXVIII", RomanNumeralConverter.convertToRoman(23988));

    }

}