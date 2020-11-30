package simplejavacalculator;

import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static org.junit.jupiter.api.Assertions.assertEquals;

class logTest {

    @Test
    void calculateMono() {
        Calculator cl = new Calculator();
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.log,1.0),0.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.log,-3.0),NaN);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.log,10.0),1.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.log,POSITIVE_INFINITY),POSITIVE_INFINITY);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.log,NaN),NaN);
    }
}