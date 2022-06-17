import java.util.Scanner;

public class pattern12 {

      /*

            A
            BC
            CDE
            DEFG

    */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            char startChar = (char) ('A' + i - 1);
            while (j <= i) {
                System.out.print(startChar);
                startChar = (char) (startChar + 1);

                j++;
            }
            System.out.println();
            i++;
        }

    }

}
