/*
 * JAVA calculator
 *
 * @author Stewart
 * @version JAVA 8, 9/10/2018
 */

public class CalculatorTest {
    public static void main(String[] args) {                                    // creates an entry point method that expects no returns
        Calculator calc = new Calculator();

        calc.setNum1(5);
        calc.setNum2(5);
        calc.setOperator("+");
        calc.setOperator("-");
        calc.setOperator("*");
        calc.setOperator("x");
        calc.setOperator("/");
        calc.setOperator("dfas");
        calc.performOperation();
        System.out.println(calc.getResults());
    }
}