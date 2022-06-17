package ArrayPrograms;

import java.util.Scanner;

public class PrintSumOfElements {

    private static int printSum(int[] input) {
        int sum = 0;
        int size = input.length;
        for (int i = 0; i < size; i++) {
            sum = sum + input[i];
        }
        return sum;
    }

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
        int result = printSum(arr);
        System.out.println(result);
    }

}
