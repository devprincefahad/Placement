public class RecursionDemo {

    public static void main(String[] args) {
        //printDecreasing(5);
        //printDI(5);
        printDISkip(5);
        //printIncreasing(5);
    }

    private static void printDISkip(int n) {
        if (n == 0) {
            return;
        }
        if (n % 2 == 1) {
            System.out.println(n);
        }
        printDISkip(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }
    }

    private static void printDI(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDI(n - 1);
        System.out.println(n);
    }

    private static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }

    private static void printDecreasing(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);
        printDecreasing(n - 1);
    }

}
