public class ExamOne {

    public static void main(String[] args) {
        int numOne = 1;
        int numTwo = 3;

        System.out.println(sumBetween(numOne, numTwo));
    }

    public static int sumBetween(int a, int b) {
        int smallerNumber = 0;
        int largerNumber = 0;
        int result = 0;

        if (a <= b) {
            smallerNumber = a;
            largerNumber = b;
        } else {
            largerNumber = a;
            smallerNumber = b;
        }

        if (smallerNumber == largerNumber) {
            return smallerNumber;
        } else {
            for (int i = smallerNumber; i <= largerNumber; i++) {
                result += i;
            }
        }
        return result;
    }
}
