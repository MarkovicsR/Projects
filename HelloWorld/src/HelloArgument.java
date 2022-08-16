import java.util.Scanner;

public class HelloArgument {

    public static void main(String[] args) {
        System.out.println("What's your name?");
        sayHello();
    }

    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getHelloMessage(String name) {
        if (name.equals("")) {
            return "Hello, World!";
        } else {
            return "Hello, " + name + "!";
        }
    }

    public static void sayHello() {
        System.out.println(getHelloMessage(getUserName()));
    }
}