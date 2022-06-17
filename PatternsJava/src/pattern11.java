import java.util.Scanner;

public class pattern11 {

    /*

            A
            BB
            CCC
            DDDD

    */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        char startChar = (char) ('A');
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(startChar);
                j++;
            }
            startChar++;
            System.out.println();
            i++;
        }

    }

}
