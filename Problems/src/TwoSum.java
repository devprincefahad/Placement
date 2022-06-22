public class TwoSum {

    public static void twoSum(int[] arr, int target) {
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] + arr[j] == target) {
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    for (int elem : result) {
                        System.out.print(elem + " ");
                    }
                }
            }
            return;
        }
    }

    public static void main(String[] args) {
        int[] array = {3,4,6,7,9,1,2};
        twoSum(array,5);
    }

}
