import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        String str = "ldkjsnvbf";
        int repeat = 3;
        System.out.println(remove(str));
    }

    public static String remove(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < str.length() - 1; i++) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String repeatStr(final int repeat, final String string) {
        SringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}
