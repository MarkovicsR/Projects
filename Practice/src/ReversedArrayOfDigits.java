public class ReversedArrayOfDigits {

    public static void main(String[] args) {
        long testNumber = 9853647;
        System.out.println(testNumber);

        for (long number : digitize(testNumber)) {
            System.out.println(number);
        }
    }

    public static int[] digitize(long n) {

        String numbersConvertedToString = String.valueOf(n);
        int[] numberArray = new int[numbersConvertedToString.length()];
        int indexCounter = 0;

        for (int i = numbersConvertedToString.length(); i > 0; i--) {
            int integerToAdd = Character.getNumericValue(numbersConvertedToString.charAt(i - 1));
            numberArray[indexCounter] = integerToAdd;
            indexCounter++;
        }
        return numberArray;
    }
}
