package simplejavacalculator;

import org.junit.jupiter.api.Test;

import static java.lang.Double.*;
import static org.junit.jupiter.api.Assertions.*;

class multiplyTest {

    @Test
    void calculateBi() {
        Calculator cl = new Calculator();
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.multiply,1.0),NaN);
        assertEquals(cl.calculateEqual(0.0),0.0);
        assertEquals(cl.reset(),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.multiply,3.0),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.multiply,2.0),6.0);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.multiply,-2.0),-12.0);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.multiply,-2.5),30.0);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.multiply,0.0),0.0);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.multiply,POSITIVE_INFINITY),NaN);
        assertEquals(cl.calculateEqual(3.7),NaN);
        assertEquals(cl.reset(),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.multiply,1E155),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.multiply,1E155),POSITIVE_INFINITY);
        assertEquals(cl.calculateEqual(-1.0),NEGATIVE_INFINITY);
        assertEquals(cl.reset(),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.multiply,3.0),NaN);
        assertEquals(cl.calculateEqual(1.1),3.3);

    }
}