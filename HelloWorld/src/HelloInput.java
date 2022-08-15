import java.util.Scanner;

public class HelloInput {

    public static void main(String[] args) {
        System.out.println("What's your name?");
        sayHello();
    }

    public static String getHelloMessage () {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.equals("")) {
            return "Hello, World!";
        } else {
            return "Hello, " + name + "!";
        }
    }

    public static void sayHello (){
        System.out.println(getHelloMessage());
    }
}
