public class pattern {
    public static void main(String[] args) {
        System.out.println(pattern(5));
    }

    public static String pattern(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                sb.append("1");
            }
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append(i + 1);
            if (i != n - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
