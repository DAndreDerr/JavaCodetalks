//First we declare the class name 'public class Factorial'
//public means this class can be accessed by any other class
public class Factorial {
    //declare the class method (factorial)
    //set the argument to be passed through the method in this case its 'int n'
    // int n is the number we are checking whether its a factorial or not
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}