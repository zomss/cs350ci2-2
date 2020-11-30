package simplejavacalculator;

import org.junit.jupiter.api.Test;

import static java.lang.Double.POSITIVE_INFINITY;
import static org.junit.jupiter.api.Assertions.assertEquals;

class cosTest {

    @Test
    void calculateMono() {
        Calculator cl = new Calculator();
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.cos,0.0),1.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.cos,180.0),-1.0);

        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.cos,90.0),0.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.cos,60.0),0.5);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.cos,30.0),Math.sqrt(3.0/4));

    }
}