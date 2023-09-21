package Tests;

import Katas.Converter;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConverterTest {
    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(-17.7778, Converter.fahrenheitToCelsius(0), 0.0001);
        assertEquals(0, Converter.fahrenheitToCelsius(32), 0.0001);
        assertEquals(100, Converter.fahrenheitToCelsius(212), 0.0001);
        assertEquals(-40, Converter.fahrenheitToCelsius(-40), 0.0001);
        assertEquals(-566.6667, Converter.fahrenheitToCelsius(-988), 0.0001);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(0, Converter.celsiusToFahrenheit(-17.7778), 0.0001);
        assertEquals(32, Converter.celsiusToFahrenheit(0), 0.0001);
        assertEquals(212, Converter.celsiusToFahrenheit(100), 0.0001);
        assertEquals(-40, Converter.celsiusToFahrenheit(-40), 0.0001);
        assertEquals(-988, Converter.celsiusToFahrenheit(-566.6667), 0.0001);
    }
}