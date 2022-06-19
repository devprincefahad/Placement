public class BinarySearch {

    public static int binarySearch(int[] arr, int item) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] < item) {
                low = mid + 1;
            } else if (arr[mid] > item) {
                high = mid - 1;
            }else{
                return mid;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        System.out.println(binarySearch(array,100));

    }

}
