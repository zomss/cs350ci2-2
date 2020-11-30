package simplejavacalculator;

import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static org.junit.jupiter.api.Assertions.assertEquals;

class tanTest {

    @Test
    void calculateMono() {
        Calculator cl = new Calculator();
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.tan,90.0),NaN);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.tan,270.0),NaN);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.tan,0.0),0.0);

        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.tan,60.0),Math.sqrt(3.0));
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.tan,45.0),1.0);

    }
}