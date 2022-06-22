public class TwoDArrayDemo {

    public static void main(String[] args) {

        // To initialize 2D array

        int[][] arr;
        arr = new int[3][3];

        arr[0][0] = 10;
        arr[2][0] = 20;

        //to print 2D array
        display(arr);

        // a new method to initialize 2 array
        //int[][] arr1 = new int[][3]; // not possible
        int[][] arr2 = new int[3][]; // possible but stores null

        arr2[0] = new int[4];
        arr2[2] = new int[3];

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);


        // System.out.println(arr2[3]); // array index out of bound exception

        arr2[1] = new int[2];
        display(arr2);

    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
