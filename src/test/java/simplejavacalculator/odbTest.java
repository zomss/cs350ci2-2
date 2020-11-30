package simplejavacalculator;

import org.junit.jupiter.api.Test;

import static java.lang.Double.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class odbTest {

    @Test
    void calculateMono() {
        Calculator cl = new Calculator();
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy,1.0),1.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy,-1.0),-1.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy,2.0),0.5);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy,0.0),POSITIVE_INFINITY);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy,POSITIVE_INFINITY),0.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy,NEGATIVE_INFINITY),-0.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy,NaN),NaN);
    }
}