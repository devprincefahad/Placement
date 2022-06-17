public class fibonacci {

    public static void fib(int n) {
        int num1 = 0, num2 = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; i++) {

            int nextTerm = num1 + num2;
            num1 = num2;
            num2 = nextTerm;

            System.out.print(num1 + ", ");

        }
    }

    public static void main(String[] args) {
        fib(10);
    }

}
