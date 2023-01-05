public class fibonacci {

    public static void fib(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; i++) {

            int nextTerm = a + b;
            a = b;
            b = nextTerm;

            System.out.print(a + ", ");

        }
    }

    public static void main(String[] args) {
        fib(10);
    }

}
