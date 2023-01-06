public class DecToBin {

    public static void decToBinString(int n) {
        String str = "";
        while (n > 0) {
            int r = n % 2;
            n = n / 2;
            str = r + str;
        }
        System.out.println(str);
    }

    public static void decToBinArray(int n) {
        int[] arr = new int[100];
        int i = 0;
        while (n != 0) {
            arr[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }

    public static void main(String[] args) {
        decToBinString(2);
        decToBinArray(160);
    }

}
