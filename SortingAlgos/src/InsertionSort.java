public class InsertionSort {

    private static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {99, 88, 77, 66, 55};
        insertionSort(array);
        display(array);
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i <= array.length - 1; i++) {
            int val = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > val) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = val;
        }
    }


}
