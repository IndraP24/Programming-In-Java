package Language;

// The proper way to declare a class(String) variable

public class VarString {
    static String helloMessage;

    public static void main (String[] args) {
        helloMessage = "Hello, World!";
        System.out.println(helloMessage);
    }

    // static String helloMessage;
    // Placing class variable declarations at the beginning of the class isn't mandatory.
}
