package simplejavacalculator;

import org.junit.jupiter.api.Test;

import static java.lang.Double.*;
import static org.junit.jupiter.api.Assertions.*;

class addTest {

    @Test
    void calculateBi() {
        Calculator cl = new Calculator();
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.add,1.0),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.add,0.0),1.0);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.add,2.0),3.0);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.add,0.0),3.0);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.add,-10.0),-7.0);
        assertEquals(cl.calculateEqual(POSITIVE_INFINITY),POSITIVE_INFINITY);
        assertEquals(cl.reset(),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.add,0.0),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.add,NEGATIVE_INFINITY),NEGATIVE_INFINITY);
        assertEquals(cl.calculateEqual(NaN),NaN);

    }
}