public class forSum {

    public static int printSumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = printSumToN(100);
        System.out.println(result);
    }

}
