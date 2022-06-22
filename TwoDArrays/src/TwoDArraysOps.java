import java.util.Scanner;

public class TwoDArraysOps {

    public static void main(String[] args) {

        int[][] arr = takeInput();
        display(arr);
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        display(arr2);
    }

    private static int[][] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = s.nextInt();
        int[][] arr = new int[rows][];
        for (int row = 0; row < rows; row++) {
            System.out.println("Enter the number of columns for row: " + row);
            int cols = s.nextInt();
            arr[row] = new int[cols];
            for (int col = 0; col < cols; col++) {
                System.out.println("Enter the value of row " + row + " and col " + col);
                arr[row][col] = s.nextInt();
            }
        }
        return arr;
    }

    public static void display(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

}
