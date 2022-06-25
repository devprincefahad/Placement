import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {

        String str = "Hello";
        //str = "Bye";
        //strings are immutable in java
        System.out.println(str);
        // .length returns the length of string, cuz string is an array of characters.
        // we can access individual characters by these functions.
        System.out.println(str.length());
        // charAt is a function which allows to access the character at a particular position.
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(str.length() - 1));

        // substring(2 params) function is used to access multiple
        // characters of a string at a same time
        System.out.println(str.substring(2, 4));
        System.out.println(str.substring(2, 5));
        System.out.println(str.substring(3, 3));
        System.out.println(str.substring(0, 3));

        //substring(1 param) takes starting index till end
        System.out.println(str.substring(3));

        // concatenation = adding two strings together
        String s1 = "hi";
        String s2 = "bye";
        String s3 = s1 + s2;
        System.out.println(s3);
        String s4 = s1.concat(s2);
        System.out.println(s4);

        // == & .equals()
        s1 = "Hello";
        s2 = s1;
        s3 = "Hello";
        s4 = new String("Hello");

        System.out.println((s1 == s2) + ", " + s1.equals(s2));
        System.out.println((s1 == s3) + ", " + s1.equals(s3));
        System.out.println((s1 == s4) + ", " + s1.equals(s4));

        // indexOf function returns index where the 'el' is present
        System.out.println(str.indexOf("el"));
        System.out.println(str.indexOf("El"));


        //startsWith
        System.out.println(str.startsWith("he"));
        System.out.println(str.startsWith("He"));

    }

}
