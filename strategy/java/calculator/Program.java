package strategy.java.calculator;

import strategy.java.calculator.strategies.AdditionOperation;
import strategy.java.calculator.strategies.DivisionOperation;
import strategy.java.calculator.strategies.MultiplicationOperation;
import strategy.java.calculator.strategies.SubtractionOperation;

public class Program {
    public static void main(String[] args) {

        Calculator calc = new Calculator(10, 2);

        System.out.println(calc.getResult(new AdditionOperation()));
        System.out.println(calc.getResult(new SubtractionOperation()));
        System.out.println(calc.getResult(new MultiplicationOperation()));
        System.out.println(calc.getResult(new DivisionOperation()));
    }
}
