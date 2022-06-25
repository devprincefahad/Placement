import java.util.Scanner;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        System.out.println(sb.length());

        //append
        sb.append("abc");
        System.out.println(sb);

        //insert
        sb.insert(2, "def");
        System.out.println(sb);

        sb.insert(sb.length(), 'g');
        System.out.println(sb);

        //delete
        sb.deleteCharAt(3);
        System.out.println(sb);

        // update
        sb.setCharAt(4, 'd');
        System.out.println(sb);

        //to take input of StringBuilder
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // to convert stringBuilder to string
        String s = sb.toString();
        System.out.println(s);

        // to convert string to stringBuilder

        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder);


    }

}
