package simplejavacalculator;

import static org.junit.jupiter.api.Assertions.*;
import static java.lang.Double.NaN;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void calculateBi() {
        Calculator cl = new Calculator();
        assertEquals(cl.reset(),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.add,0.0),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.divide,3.0),3.0);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.minus,1.5),2.0);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.normal,4.0),-2.0);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.multiply,1.5),NaN);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.xpowerofy,1.5),2.25);
        assertEquals(cl.calculateBi(Calculator.BiOperatorModes.normal,1.5),3.375);
    }

//    @org.junit.jupiter.api.Test
//    void calculateEqual() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void reset() {
//    }

    @org.junit.jupiter.api.Test
    void calculateMono() {
        Calculator cl = new Calculator();
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.square,1.5),2.25);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.squareRoot,10.24),3.2);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy,625.0),0.0016);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.cos,0.0),1.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.sin,Math.PI/2),1.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.tan,0.0),0.0);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.log,10000.0),4);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.rate,87.875),0.87875);
        assertEquals(cl.calculateMono(Calculator.MonoOperatorModes.abs,-4123.2134),4123.2134);
    }
}