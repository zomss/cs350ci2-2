package simplejavacalculator;

import org.junit.jupiter.api.Test;

import static java.lang.Double.*;
import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.*;

class divideTest {

    @Test
    void calculateBi() {
        Calculator cl = new Calculator();
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.divide,1.0),NaN);
        assertEquals(cl.calculateEqual(0.0),POSITIVE_INFINITY);
        assertEquals(cl.reset(),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.divide,-1.0),NaN);
        assertEquals(cl.calculateEqual(0.0),NEGATIVE_INFINITY);
        assertEquals(cl.reset(),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.divide,1.0),NaN);
        assertEquals(cl.calculateEqual(POSITIVE_INFINITY),0.0);
        assertEquals(cl.reset(),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.divide,1.0),NaN);
        assertEquals(cl.calculateEqual(NEGATIVE_INFINITY),0.0);
        assertEquals(cl.reset(),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.divide,1.0),NaN);
        assertEquals(cl.calculateEqual(NaN),NaN);
        assertEquals(cl.reset(),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.divide,7.0),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.divide,3.5),2.0);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.divide,1E170),2E-170);
        assertEquals(cl.calculateEqual(1E170),0.0);
    }
}