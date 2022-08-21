public class StringTheory {

    public static void main(String[] args) {

        String sentence = "Ro Tato r";
        System.out.println(isPalindrome(sentence));

    }

    public static boolean isPalindrome (String stringToCheck) {
        stringToCheck.replace(" ", "");
        String input = stringToCheck.toLowerCase();
        char[] charArray = input.toCharArray();
        boolean isPalindrome = false;

        for(int i = 0; i < input.length(); i++) {
            if (charArray[i] == charArray[charArray.length-i -1]) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
