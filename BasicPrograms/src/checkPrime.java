public class checkPrime {

    public static boolean isPrime(int n) {
        int d = 2;
        for (int i = 1; i < n; i++) {
            if (n % d == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = isPrime(10);
        System.out.println(result);
    }
}
