// Jva Program  to check whether the number is prime or not this is the most optimised approach to solve this q
import java.util.*;

public class primeopt { 
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; 
        }
        if (n == 2) {
            return true; 
        }
        if (n % 2 == 0) {
            return false; 
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) { //main fn
        System.out.print("Is the given number prime? ");
        System.out.println(isPrime(5)); // true
    }
}
