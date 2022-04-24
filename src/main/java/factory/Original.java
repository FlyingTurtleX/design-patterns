package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Calculator.
 */
public class Original {

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

            double result;
            Double floatA = new Double(numberA);
            Double floatB = new Double(numberB);

            if ("+".equals(symbol)) {
                result = floatA + floatB;
                System.out.println("The operation result is: " + result);
            }

            if ("-".equals(symbol)) {
                result = floatA - floatB;
                System.out.println("The operation result is: " + result);
            }

            if ("*".equals(symbol)) {
                result = floatA * floatB;
                System.out.println("The operation result is: " + result);
            }

            if ("/".equals(symbol)) {
                if (floatB == 0) {
                    System.out.println("Divisor cannot be zero!");

                } else {
                    result = floatA / floatB;
                    System.out.println("The operation result is: " + result);
                }
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Something is wrong with your input, please checkout!" + e.getMessage());
        }
    }

}
