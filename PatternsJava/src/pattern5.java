import java.util.Scanner;

public class pattern5 {

    public static void main(String[] args) {

        /*

        1234
        1234
        1234
        1234

        */

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }

    }

}
