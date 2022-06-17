package ArrayIntro;

public class ArrayBasic {

    public static void main(String[] args) {

        int n = 5;
        int[] arr = new int[n];

        arr[0] = 15;

        System.out.println(arr[0]);
        System.out.println(arr[4]);

//      System.out.println(arr[15]); ArrayIndexOutOfBoundsException

        boolean arr2[] = new boolean[5];
        arr2[3] = true;
        System.out.println(arr2[3]);

    }

}
