public class printN {

    public static void printUpToN(int n) {
        if (n <= 0) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printUpToN(10);
    }
}
