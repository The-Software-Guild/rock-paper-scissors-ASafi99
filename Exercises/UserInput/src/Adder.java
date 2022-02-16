import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        boolean isValid = false;
        int sum = 0;
        int num1 = 0;
        int num2 = 0;

        do {

            try {
                System.out.println("Please enter a whole number: ");
                String input1 = myScanner.nextLine();
                System.out.println("Please enter another whole number: ");
                String input2 = myScanner.nextLine();
                num1 = Integer.parseInt(input1);
                num2 = Integer.parseInt(input2);

                sum= num1+ num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
                isValid = true;

            } catch (NumberFormatException ex) {
                System.out.println("That was not a whole number!");
            }

        } while (!isValid);


    }
}
