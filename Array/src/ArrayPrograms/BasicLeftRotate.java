package ArrayPrograms;

import java.util.Scanner;

public class BasicLeftRotate {

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
        int[] result = leftRotateArray(arr);
        printArray(result);
    }

    private static int[] leftRotateArray(int[] arr) {
        int temp = arr[0];
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        arr[size-1] = temp;
        return arr;
    }

}
