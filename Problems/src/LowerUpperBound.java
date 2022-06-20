public class LowerUpperBound {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 6, 6, 8, 9};
        int[] result = searchRange(array, 5);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] searchRange(int[] array, int elem) {
        int[] result = new int[2];
        result[0] = lowerBound(array, elem);
        result[1] = upperBound(array, elem);
        return result;
    }

    public static int lowerBound(int[] arr, int elem) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == elem) {
                ans = mid;
                high = mid - 1;
            } else if (elem < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] arr, int elem) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == elem) {
                ans = mid;
                low = mid + 1;
            } else if (elem < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

}
