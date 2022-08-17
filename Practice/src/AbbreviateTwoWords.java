import java.util.Locale;

public class AbbreviateTwoWords {

    public static void main(String[] args) {
        String nameOne = "john Smith";
        String nameTwo = "Sarah Judith";
        System.out.println(abbrevName(nameOne));
    }

    public static String abbrevName (String name) {
        name = name.toUpperCase();
        String[] stringArray = name.split(" ");
        String initials = stringArray[0].charAt(0) + "." + stringArray[1].charAt(0);
        return initials;
    }
}
