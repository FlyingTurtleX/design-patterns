package factory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Refactor1st {

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

            if (Operator.ADD.getOperator().equals(symbol)) {
                System.out.println(Operator.ADD.getOperation().getResult(first, second));
            }

            if (Operator.MINUS.getOperator().equals(symbol)) {
                System.out.println(Operator.MINUS.getOperation().getResult(first, second));
            }

            if (Operator.MULTIPLY.getOperator().equals(symbol)) {
                System.out.println(Operator.MULTIPLY.getOperation().getResult(first, second));
            }

            if (Operator.DIVIDE.getOperator().equals(symbol)) {
                System.out.println(Operator.DIVIDE.getOperation().getResult(first, second));
            }

        } catch (Exception e) {
            System.out.println("Something is wrong with your input, please checkout!" + e.getMessage());
        }
    }

}
