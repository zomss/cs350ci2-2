package simplejavacalculator;

import org.junit.jupiter.api.Test;

import static java.lang.Double.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class rateTest {

    @Test
    void calculateMono() {
        Calculator cl = new Calculator();
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.rate,1.5),0.015);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.rate,100.0),1.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.rate,POSITIVE_INFINITY),POSITIVE_INFINITY);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.rate,NEGATIVE_INFINITY),NEGATIVE_INFINITY);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.rate,NaN),NaN);
    }
}