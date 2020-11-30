package simplejavacalculator;

import org.junit.jupiter.api.Test;

import static java.lang.Double.POSITIVE_INFINITY;
import static org.junit.jupiter.api.Assertions.assertEquals;

class sinTest {

    @Test
    void calculateMono() {
        Calculator cl = new Calculator();
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.sin,90.0),1.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.sin,270.0),-1.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.sin,0.0),0.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.sin,60.0),Math.sqrt(3.0/4));

        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.sin,30.0),0.5);
    }
}