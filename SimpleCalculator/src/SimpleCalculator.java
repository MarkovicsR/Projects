import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");
        String str = scanner.nextLine();
        if (isNumber(str)) {
            convertNumber(str);
            System.out.println(str);
        } else {
            System.out.println("Not a number!");
        }
    }

    public static boolean isNumber (String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static float convertNumber(String str) {
        return Float.parseFloat(str);
    }
}
