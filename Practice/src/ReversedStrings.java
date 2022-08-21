public class ReversedStrings {

    public static void main(String[] args) {
        String testString = "World";

        System.out.println(solution(testString));
    }

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length(); i > 0; i--) {
            sb.append(str.charAt(i - 1));
        }
        return sb.toString();
    }
}
