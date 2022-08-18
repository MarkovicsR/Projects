import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        do {
            askForANumber(forceValidInput(true));
        } while (forceValidInput(false));
    }

    public static boolean isNumber (String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean forceValidInput (boolean isItANumber) {
        if (isItANumber) {
            return true;
        }else {
            return false;
        }
    }

    public static float convertNumber(String str) {
        return Float.parseFloat(str);
    }

    public static Float askForANumber (boolean forceValidInput) {
        /*System.out.println("Enter a number!");
        input();
        if (forceValidInput) {
            float inputNUmber = convertNumber(input());
            System.out.println(input());
            return inputNUmber;
        } else {
            System.out.println("Not a number!");
            return null;
        }*/
        while (true) {

        }
    }

    public static String input () {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }
}
