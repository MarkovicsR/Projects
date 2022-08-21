public class StringTheory {

    public static void main(String[] args) {

        String sentence = "Sphinx of black quartz judge y vow";
        System.out.println(isPalindrome(sentence));
        System.out.println(isIsogram(sentence));
        System.out.println(isPangram(sentence));
    }

    public static boolean isPalindrome (String stringToCheck) {
        char [] charArray = convertToCharArray(stringToCheck);
        boolean isPalindrome = false;

        for(int i = 0; i < charArray.length; i++) {
            if (charArray[i] == charArray[charArray.length-i -1]) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static boolean isIsogram (String stringToCheck) {
        int counter = 1;
        char[] charArray = convertToCharArray(stringToCheck);
        boolean isIsogram = true;

        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (i == j) {
                    continue;
                } else if (charArray[i] == charArray[j]) {
                    isIsogram = false;
                    break;

                }
            }
        }
        return isIsogram;
    }

    public static boolean isPangram (String stringToCheck) {
        char[] charArray = convertToCharArray(stringToCheck);
        char[] alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' };
        boolean isPangram = true;
        for (int i = 0; i < alphabet.length; i++) {
            label:
            for (int j = 0; j < charArray.length; j++) {
                if (alphabet[i] == charArray[j]) {
                    isPangram = true;
                    break label;
                } else {
                    isPangram = false;

                }
            }
        }
        return isPangram;
    }
    

    public static char[] convertToCharArray (String stringToConvert) {
        String input = stringToConvert.toLowerCase().replace(" ", "");
        char[] charArray = input.toCharArray();
        return charArray;
    }
}
