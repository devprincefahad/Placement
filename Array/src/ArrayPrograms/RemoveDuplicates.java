package ArrayPrograms;

import java.util.Scanner;

public class RemoveDuplicates {

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
        int result = removeDuplicates(arr);
        System.out.println(result);
        printArray(arr);
    }

    private static int removeDuplicates(int[] arr) {
        int size = arr.length;
        int temp[] = new int[size];
        int res = 1;
        temp[0] = arr[0];
        for (int i = 1; i <size; i++){
            if(temp[res-1]!=arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }
        for(int i=0; i<res; i++){
            arr[i] = temp[i];
        }
        return res;
    }

}
