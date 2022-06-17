public class factorial {

    public static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int result = fact(5);
        System.out.println(result);
    }

}
