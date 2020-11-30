package simplejavacalculator;

import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static org.junit.jupiter.api.Assertions.*;

class squareTest {

    @Test
    void calculateMono() {
        Calculator cl = new Calculator();
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.square,1.5),2.25);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.square,0.0),0.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.square,-1.0),1.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.square,5.0),25.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.square,1E155),POSITIVE_INFINITY);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.square,1E-170),0.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.square,2.1),4.41);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.square,1.1),1.21);

    }
}