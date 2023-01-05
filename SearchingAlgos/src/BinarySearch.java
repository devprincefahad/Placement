public class BinarySearch {

    public static int binarySearch(int[] arr, int item) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] < item) {
                start = mid + 1;
            } else if (arr[mid] > item) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        System.out.println(binarySearch(array, 100));

    }

}
