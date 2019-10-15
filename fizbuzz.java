
import java.util.Scanner;

public class excercise {


    public static class DemoFizzBuzz {

        private static final String FIZZ = "Fizz";
        private static final String BUZZ = "Buzz";
        private static final String FIZZ_BUZZ = "FizzBuzz";

        public static void main(String[] args) {

            try (Scanner scanner = new Scanner(System.in)) {

                System.out.println("Enter input number please : ");
                int inputNumber = scanner.nextInt();
                for (int number = 1; number <= inputNumber; number++) {

                    // If number is divisible by 15 ( 5 * 3)
                    if (number % 15 == 0) {
                        System.out.printf("%s ", FIZZ_BUZZ);
                    } else if (number % 3 == 0) { // If number is divisible by 3
                        System.out.printf("%s ", FIZZ);
                    } else if (number % 5 == 0) { // If number is divisible by 5
                        System.out.printf("%s ", BUZZ);
                    } else {
                        System.out.printf("%d ", number);
                    }
                }
            }
        }
    }
}







