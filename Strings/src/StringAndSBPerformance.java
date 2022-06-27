public class StringAndSBPerformance {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        appendStringBuilder(100000);
        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }

    public static void appendString(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
    }

    public static void appendStringBuilder(int n) {
        String s = "";
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
    }

}
