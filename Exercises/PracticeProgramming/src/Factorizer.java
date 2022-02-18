import java.util.Scanner;

public class Factorizer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What number would you like to factor?");
        // positive number
        int number = Integer.parseInt(scanner.nextLine());

        System.out.print("Factors of " + number + " are: ");

        int factorCounter = 0;
        // loop runs from 1 to 60
        for (int i = 1; i < number; ++i) {

            // if number is divided by i
            // i is the factor
            if (number % i == 0) {
                System.out.print(i + " ");
                factorCounter++;
            }
        }

        String isPerfect = isPerfect(number) ? number + " is a perfect number." : number + " is not a perfect number." ;

        String isPrime = isPrime(number) ? number + " is a prime number." : number + " is not a prime number." ;

        System.out.println("\n" + number + " has " + factorCounter + " factors");
        System.out.println(isPerfect + "\n" + isPrime);
    }

    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    static boolean isPerfect(int n)
    {
        // 1 is not a perfect number
        if (n == 1)
            return false;

        // sum will store the sum of proper divisors
        // As 1 is a proper divisor for all numbers
        // initialised sum with 1
        int sum = 1;

        // Looping through the numbers to check if they are
        // divisors or not
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                sum += i;
            }

        }

        // If sum of divisors is equal to
        // n, then n is a perfect number
        if (sum == n)
            return true;

        return false;
    }
}
