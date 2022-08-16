public class ProjectRewrite {

    public static void main(String[] args) {
        int numberOne = 3;
        int numberTwo = 6;
        int[] arrayOne = {1, 3, 9, 11};
        min(numberOne, numberTwo);
        max(arrayOne);
        len(arrayOne);
        multiply(numberOne, numberTwo);
        pow(numberOne, numberTwo);
    }

    public static void min(int numberOne, int numberTwo) {
        if (numberOne < numberTwo) {
            System.out.println(numberOne);
        } else if (numberOne == numberTwo) {
            System.out.println("They are equals!");
        } else {
            System.out.println(numberTwo);
        }
    }

    public static void max(int[] arrayOne) {
        int highestNumber = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] > highestNumber) {
                highestNumber = arrayOne[i];
            }
        }
        System.out.println(highestNumber);
    }

    public static void len (int[]arrayOne) {
        System.out.println(arrayOne.length);
    }

    public static void multiply (int numberOne, int numberTwo) {
        int finalNumber = 0;
        for (int i = 0; i < numberTwo; i++) {
            finalNumber += numberOne;
        }
        System.out.println(finalNumber);
    }

    public static void pow (int numberOne, int numberTwo) {
        int finalNumber = numberOne;
        for (int i = 0; i < numberTwo - 1; i++) {
            finalNumber = finalNumber * numberOne;
        }
        System.out.println(finalNumber);
    }
}