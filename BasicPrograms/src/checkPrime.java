public class checkPrime {

    // a number only divided by itself and 1 is prime number.

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            //rem = 0, Not Prime
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = isPrime(7);
        System.out.println(result);
    }
}
