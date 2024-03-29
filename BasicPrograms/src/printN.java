public class printN {

    public static int subtractProductAndSum(int n) {

        int product = 1;
        int sum = 0;

        String str = Integer.toString(n);
        int[] arr = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i) - '0';
            product = product * arr[i];
            sum = sum + arr[i];
        }

        return product - sum;
    }

    public static void printUpToN(int n) {
        if (n <= 0) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        //printUpToN(10);
        int res = subtractProductAndSum(234);
        System.out.println(res);
    }
}
