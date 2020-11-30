package simplejavacalculator;

import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.*;

class sqrtTest {

    @Test
    void calculateMono() {
        Calculator cl = new Calculator();
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.squareRoot,0.0),0.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.squareRoot,-1.5),NaN);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.squareRoot,1.0),1.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.squareRoot,4.41),2.1);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.squareRoot,7.0),Math.sqrt(7.0));
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.squareRoot,1.21),1.1);
    }
}