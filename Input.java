import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Age is: " + age);

        System.out.println("Enter your name: ");
        String name = sc.next();
        // next function takes only tokens
        System.out.println("Name is :" + name);

        System.out.println("Enter Sentence: ");
        String sent = sc.nextLine();
        // nextLine prints the whole line
        System.out.println("Your picked sentence is: " + sent);

    }
}
