package simplejavacalculator;

import org.junit.jupiter.api.Test;

import static java.lang.Double.*;
import static java.lang.Double.NEGATIVE_INFINITY;
import static org.junit.jupiter.api.Assertions.*;

class minusTest {

    @Test
    void calculateBi() {
        Calculator cl = new Calculator();
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.minus,1.0),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.minus,0.0),1.0);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.minus,2.0),-1.0);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.minus,-10.0),9.0);
        assertEquals(cl.calculateEqual(POSITIVE_INFINITY),NEGATIVE_INFINITY);
        assertEquals(cl.reset(),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.minus,0.0),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.minus,NEGATIVE_INFINITY),POSITIVE_INFINITY);
        assertEquals(cl.calculateEqual(NaN),NaN);
    }
}