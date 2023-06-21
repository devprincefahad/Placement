package ArrayPrograms;

import java.util.Scanner;

public class ReverseArray {

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

    public static void main(String[] args) {
        int[] arr = takeInput();
        printArray(arr);
        int[] result = reverseArray(arr);
        printArray(result);
    }

    private static int[] reverseArray(int[] arr) {
        int size = arr.length;
        int low = 0, high = size - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }

}
