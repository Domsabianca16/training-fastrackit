package course4.homework;

public class Calculator {
    private static int add(int a, int b) {
        return a + b;
    };
    private static int sub(int a, int b) {
        return a - b;
    };
    private static int mul(int a, int b) {
        return a * b;
    };
    private static int div(int a, int b) {
        if (b == 0){
            return 0;
        }else{
            return a / b;
        }

    };
    public Calculator(int a, int b, String op) {
    switch (op) {
        case "add":
            System.out.println("Result: " + add(a, b));
            break;
        case "sub":
            System.out.println("Result: " + sub(a, b));
            break;
        case "mul":
            System.out.println("Result: " + mul(a, b));
            break;
        case "div":
                System.out.println("Result: " + div(a, b));
            break;
        default:
            System.out.println("Invalid operation");
            break;
    }
}

    public static void main(String[] args) {
        Calculator calc1 = new Calculator(1,2,"add");
        Calculator calc2 = new Calculator(2,3,"sub");
        Calculator calc3 = new Calculator(3,4,"mul");
        Calculator calc4 = new Calculator(10,5,"div");




    }
}
