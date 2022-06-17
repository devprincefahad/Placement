import java.util.Scanner;

public class pattern3 {

    public static void main(String[] args) {

        /*
                1
               23
              456
            78910
        */

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        int val = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            int t = 1;
            while (t <= i) {
                System.out.print(val);
                val++;
                t++;
            }
            System.out.println();
            i++;
        }

    }

}
