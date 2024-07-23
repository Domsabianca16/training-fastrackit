package course4.homework;

public class Nfactorial {
    public static void main(String[] args) {
        System.out.println("Factorial of 6 is " + factorial(6));
        System.out.println("Factorial of 7 is " + factorial(7));
        System.out.println("Factorial of 8 is " + factorial(8));
        System.out.println("Factorial of 9 is " + factorial(9));
        System.out.println("Factorial of 10 is " + factorial(10));
    }

    private static int factorial(int n) {
        if (n == 0){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    };

}
