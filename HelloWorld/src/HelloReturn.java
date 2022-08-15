public class HelloReturn {

    public static void main(String[] args) {
        sayHello();
    }

    public static String getHelloMessage (){
        return "Hello, World!";
    }

    public static void sayHello(){
        System.out.println(getHelloMessage());
    }
}
