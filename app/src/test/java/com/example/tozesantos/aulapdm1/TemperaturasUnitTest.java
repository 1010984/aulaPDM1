package com.example.tozesantos.aulapdm1;

import com.example.tozesantos.utils.Temperatura;
import com.example.tozesantos.utils.TemperaturaFactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TemperaturasUnitTest {

    @Test
    public void addition_isCorrect() {
        Temperatura temp = TemperaturaFactory.Celsius(4.0);

        assertEquals("value is not correct expected 4, get " + temp.getCelsius(),4,temp.getCelsius(),0.02);
        assertEquals(39.2,temp.getFarhenheit(),0.02);

        temp = TemperaturaFactory.Farhenheit(39.2);

        assertEquals("value is not correct expected 39.2, get " + temp.getFarhenheit(),39.2,temp.getFarhenheit(),0.02);
        assertEquals(4.0 ,temp.getCelsius(),0.02);
    }
}