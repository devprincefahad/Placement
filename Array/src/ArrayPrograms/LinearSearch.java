package ArrayPrograms;

import java.util.Scanner;

public class LinearSearch {


    public static int linearSearch(int[] input, int x) {
        int i;
        int size = input.length;
        for (i = 0; i < size; i++) {
            if (input[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void printArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] result = takeInput();
        printArray(result);
        System.out.println();
        System.out.println(linearSearch(result, 5));
    }

}
