import java.util.Scanner;

public class StringOps {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        printChars(str);
        printSubStrings(str);


    }

    private static void printSubStrings(String str) {

        // ques - given a string print all substrings
        for (int si = 0; si <= str.length() - 1; si++) {

            for (int ei = si + 1; ei <= str.length(); ei++) {

                String ss = str.substring(si, ei);
                System.out.println(ss);

            }

        }

    }

    private static void printChars(String str) {

        //ques - to print string in char format after taking input from user in diff lines

        for (int i = 0; i <= str.length() - 1; i++) {
            System.out.println(str.charAt(i));
        }
    }

}
