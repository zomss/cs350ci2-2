package simplejavacalculator;

import org.junit.jupiter.api.Test;

import static java.lang.Double.*;
import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.*;

class powerTest {

    @Test
    void calculateBi() {
        Calculator cl = new Calculator();
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.xpowerofy,1.5),NaN);
        assertEquals(cl.calculateEqual(POSITIVE_INFINITY),POSITIVE_INFINITY);
        assertEquals(cl.reset(),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.xpowerofy,2.0),NaN);
        assertEquals(cl.calculateEqual(NEGATIVE_INFINITY),0.0);
        assertEquals(cl.reset(),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.xpowerofy,-10.0),NaN);
        assertEquals(cl.calculateEqual(3.1),NaN);
        assertEquals(cl.reset(),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.xpowerofy,-3.0),NaN);
        assertEquals(cl.calculateEqual(4.0),81.0);
        assertEquals(cl.reset(),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.xpowerofy,16.0),NaN);
        assertEquals(cl.calculateEqual(2.5),1024.0);
        assertEquals(cl.reset(),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.xpowerofy,1.1),NaN);
        assertEquals(cl.calculateEqual(2.0),1.21);
    }
}