import java.util.*;

public class Method {
    public static void printJava() {
        System.out.println("Hello world");
    }

    public static void printName(String name) {
        System.out.println("Your name is " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printJava();
        System.out.println("Enter your name: ");
        String name = sc.next();
        printName(name);

    }

}
