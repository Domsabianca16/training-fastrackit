package course4.homework;

public class PrimeNumber {
    public static void main(String[] args) {
        int x = 29;
        if (isPrime(x)) {
            System.out.println(x + " is a prime number.");
        } else {
            System.out.println(x + " is not a prime number.");
        }

    }
    private static boolean isPrime(int n) {
       if (n < 2) {
           return false;
       }
       else if (n==2 ) {
           return true;
       }
       else if (n%2==0) {
           return false;
       }
       for (int i=3; i<=Math.sqrt(n); i+=2) {
           if (n%i == 0) {
               return false;
           }
       }
       return true;

    }
}
