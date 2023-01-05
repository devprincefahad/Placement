public class BitwiseOperators {

    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        // bitwise and
        System.out.println("a&b = " + (a & b));

        // bitwise or
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        System.out.println("a^b = " + (a ^ b));

        // bitwise not
        System.out.println("~a = " + ~a);

        //**************************************//

        //Left Shift Operator = Add extra 0s to the left

        int c = a << 2; // a = 101
        System.out.println(c);

        //Right Shift Operator = Send 2bits of number to the right/removes the last 2 digits from right

        int d = b >> 2; // 111
        System.out.println(d);

    }

}
