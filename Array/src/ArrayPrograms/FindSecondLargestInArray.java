package ArrayPrograms;

import java.util.Scanner;

public class FindSecondLargestInArray {

    public static int findSecondLargestElement(int[] input) {

        int largest = findLargestElement(input);
        int size = input.length;
        int secondLargest = -1;
        for (int j = 0; j < size; j++) {
            if (input[j] > secondLargest && input[j] != largest) {
                secondLargest = input[j];
            }
        }

        return secondLargest;

    }

    public static int findLargestElement(int[] input) {
        int size = input.length;
        int max = -1;
        for (int i = 0; i < size; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        return max;
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
        int result = findSecondLargestElement(arr);
        System.out.println(result);
    }

}
