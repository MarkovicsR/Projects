public class ExamTwo {

    public static void main(String[] args) {
        String sentence = "xxoOasdXoo";
        System.out.println(evenXAndO(sentence));
    }

    public static boolean evenXAndO(String str) {
        String lowerCaseString = str.toLowerCase();
        int xCounter = 0;
        int oCounter = 0;

        for (int i = 0; i < lowerCaseString.length(); i++) {
            if (lowerCaseString.charAt(i) == 'x') {
                xCounter++;
            }
        }

        for (int i = 0; i < lowerCaseString.length(); i++) {
            if (lowerCaseString.charAt(i) == 'o') {
                oCounter++;
            }
        }

        return xCounter == oCounter;
    }
}
