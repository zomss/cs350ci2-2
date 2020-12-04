/**
 * @name        Simple Java Calculator
 * @file        SimpleJavaCalculator.java
 * @author      SORIA Pierre-Henry
 * @copyright   Copyright Pierre-Henry SORIA, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 */

package simplejavacalculator;

class SimpleJavaCalculator {
   void main() {
      try {
         UI uiCal = new UI();
         uiCal.init();
      } catch (Exception e) {
         logger.log(e.getMessage());
      }
   }
}
