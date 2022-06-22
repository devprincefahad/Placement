package TwoDArrayPrograms;

public class WavePrint {

    public static void main(String[] args) {
        int[][] arr = {{11,12,13,14}, {21,22,23,24}, {31,32,33,34},{41,42,43,44}};
        display(arr);
    }

    public static void display(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            if (row%2==0){
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.print(arr[row][col] + " ");
                }
            }else{
                for (int col = arr[row].length-1; col >= 0; col--) {
                    System.out.print(arr[row][col] + " ");
                }
            }

            System.out.println();
        }
    }

}
