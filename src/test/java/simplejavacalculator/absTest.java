package simplejavacalculator;

import org.junit.jupiter.api.Test;

import static java.lang.Double.NEGATIVE_INFINITY;
import static java.lang.Double.POSITIVE_INFINITY;
import static org.junit.jupiter.api.Assertions.assertEquals;

class absTest {

    @Test
    void calculateMono() {
        Calculator cl = new Calculator();
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.abs,0.0),0.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.abs,-1.0),1.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.abs,3.6123),3.6123);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.abs,POSITIVE_INFINITY),POSITIVE_INFINITY);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.abs,NEGATIVE_INFINITY),POSITIVE_INFINITY);
    }
}