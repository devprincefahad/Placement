package optimized;

public class SubProAndSum {

    public static int solution(int n){
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

    public static void main(String[] args) {
        int res = solution(234);
        System.out.println(res);
    }

}
