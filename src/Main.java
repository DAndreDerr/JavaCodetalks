import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        //1. R2H Version
////        public static void main(String[] args) {
//            int number = 5;
//            int result = Factorial.factorial(number);
//            System.out.println("Factorial of " + number + " is: " + result);
//        }
//    }

        //1. Dre Version

        // n is passed as argument
        int n = 5;

        //store result of the method in a variable
        int factorialResult = Factorial.factorial(n);

        // print the captured result
        System.out.println("This is Problem 1!");
        System.out.println("Factorial of " + n + " is: " + factorialResult + " :)");



        //2.
        //declare the number we want to check in our class's method
        System.out.println("This is Problem 2!");
        int number = 17;
        // Class needed to be invoked first before using its method 'primeNumber before .isPrime(number)
        if (primeNumber.isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Problem 3

        System.out.println("Problem 3");
        // Here we store unsorted numbers
        int[] numbers = {5, 2, 8, 1, 9};
        // We use the sort method to sort numbers object
        Arrays.sort(numbers);
        //we print our result below
        System.out.print("Sorted Array: ");
        //we use a for loop to iterate through the numbers object and print each one
        for (int numbern : numbers) {
            System.out.print(numbern + " ");
        }

    }
}