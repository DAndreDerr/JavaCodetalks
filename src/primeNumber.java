public class primeNumber {
    // we create a isPrime method that takes in an integer
    // and returns a boolean
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}