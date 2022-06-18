import java.util.Scanner;

public class LinearSearch {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void printArray(int[] input) {
        int size = input.length;
        for (int i = 0; i < size; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static int linearSearch(int[] arr, int item) {

        for (int i = 0; i <arr.length; i++) {
            if (item == arr[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] array = {10, 25, 5, 15, 30};
        System.out.println(linearSearch(array,50));

    }

}
