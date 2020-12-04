/**
 * @name        Simple Java Calculator
 * @file        Calculator.java
 * @author      SORIA Pierre-Henry
 * @copyright   Copyright Pierre-Henry SORIA, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 */

package simplejavacalculator;

import static java.lang.Double.NaN;
import static java.lang.Math.log10;
import static java.lang.Math.pow;

public class Calculator {
    /**
     * 탄젠트가 0이 될 때의 각도.
     */
    private static final int ZERO_TANGENT_VALUE = 180;
    /**
     * 탄젠트가 정의되지 않는 각도.
     */
    private static final int UNDEFINED_TANGENT = 90;
    /**
     * 퍼센트를 위해 나누는 100.
     */
    private static final int NUMBER_FOR_PERCENT = 100;
    public enum BiOperatorModes {
        /**
         * 두 개의 피연산자가 필요한 연산.
         * normal는 num2를 그대로 출력.
         * add는 num2를 num1에 더해서 출력.
         * minus는 num2를 num1에 빼서 출력.
         * multiply는 num2를  num1에 곱함.
         * divide는 num2를 num1에 나눔.
         * xpowerofy는 num2 수만큼 num1을 곱함.
         */
        NORMAL, ADD, MINUS, MULTIPLY, DIVIDE, XPOWEROFY
    }

    public enum MonoOperatorModes {
        /**
         * square는 제곱.
         * squareRoot는 제곱근.
         * oneDevidedBy는 역수.
         * cos는 코사인
         * sin는 사인.
         * tan는 탄젠트.
         * log는 상용로그값
         * rate는 백분율.
         * abs는 절대값.
         */
        SUQARE, SQUAREROOT, ONEDIVIDEDBY, COS, SIN, TAN, LOG, RATE, ABS
    }

    /**
     * 피연산자 1.
     */
    private Double num1;
    /**
     * 피연산자 2.
     */
    private Double num2;
    /**
     * 연산자.
     */
    private BiOperatorModes mode = BiOperatorModes.normal;
    private Double calculateBiImpl() throw Throwable {
        if (mode == BiOperatorModes.NORMAL) {
            return num2;
        }
        if (mode == BiOperatorModes.ADD) {
            if (num2 != 0) {
                return num1 + num2;
            }

            return num1;
        }
        if (mode == BiOperatorModes.MINUS) {
            return num1 - num2;
        }
        if (mode == BiOperatorModes.MULTIPLY) {
            if(num1 * num2 == -0.0)
                return 0.0;
            return num1 * num2;
        }
        if (mode == BiOperatorModes.DIVIDE) {
            if(num1 / num2 == -0.0)
                return 0.0;
            return num1 / num2;
        }
        if (mode == BiOperatorModes.XPOWEROFY) {
            return pow(num1, num2);
        }

        // never reach
        throw new RuntimeException("error");
    }
    /***
     * newMode에 해당하는 연산을 num1과 num2에 적용.
     * @param newMode 연산 종류에 대한 input.
     * @param num 피연산자에 대한 input.
     * @return 계산값을 출력.
     */
    public Double calculateBi(final BiOperatorModes newMode, final Double num) {
        if (mode == BiOperatorModes.normal) {
            num2 = 0.0;
            num1 = num;
            mode = newMode;
            return NaN;
        } else {
            num2 = num;
            num1 = calculateBiImpl();
            mode = newMode;
            return num1;
        }
    }

    /***
     * num1 값을 input으로 setting.
     * @param num num1에 대한 input.
     * @return NaN
     */
    public Double calculateEqual(final Double num) throw Throwable {
        return calculateBi(BiOperatorModes.normal, num);
    }
    /***
     * num1과 num2를 reset.
     * @return NaN
     */
    public Double reset() {
        num2 = 0.0;
        num1 = 0.0;
        mode = BiOperatorModes.NORMAL;

        return NaN;
    }

    /***
     * newMode에 해당하는 연산을 num1과 num2에 적용.
     * @param newMode 연산 종류에 대한 input.
     * @param num 피연산자에 대한 input.
     * @return 계산값을 출력.
     */
    public Double calculateMono(final MonoOperatorModes newMode,
                                final Double num) {
        if (newMode == MonoOperatorModes.SQUARE) {
            return num * num;
        }
        if (newMode == MonoOperatorModes.SQUAREROOT) {
            return Math.sqrt(num);
        }
        if (newMode == MonoOperatorModes.ONEDIVIDEDBY) {
            return 1 / num;
        }
        if (newMode == MonoOperatorModes.COS) {
            return Math.cos(Math.toRadians(num));
        }
        if (newMode == MonoOperatorModes.SIN) {
            return Math.sin(Math.toRadians(num));
        }
        if (newMode == MonoOperatorModes.TAN) {
            if (num == 0 || num % ZERO_TANGENT_VALUE == 0) {
                return 0.0;
            }
            if (num % UNDEFINED_TANGENT == 0 && num % ZERO_TANGENT_VALUE != 0) {
                return NaN;
            }

            return Math.tan(Math.toRadians(num));
        }
        if (newMode == MonoOperatorModes.LOG) {
            return log10(num);
        }
        if (newMode == MonoOperatorModes.RATE) {
            return num / NUMBER_FOR_PERCENT;
        }
        if (newMode == MonoOperatorModes.ABS) {
            return Math.abs(num);
        }

        // never reach
        throw new RuntimeException("error");
    }

}
