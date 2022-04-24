package factory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Refactor2nd {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Please input a number: ");
            String numberA = bufferedReader.readLine();

            System.out.println("Please input an operator symbol: +, -, *, /");
            String symbol = bufferedReader.readLine();

            System.out.println("Please input another number: ");
            String numberB = bufferedReader.readLine();

            bufferedReader.close();

            Double first = new Double(numberA);
            Double second = new Double(numberB);

            Operator targetOperator = Operator.getTargetOperator(symbol);
            System.out.println(targetOperator.getOperation().getResult(first, second));

        } catch (Exception e) {
            System.out.println("Something is wrong with your input, please checkout!" + e.getMessage());
        }
    }
}
