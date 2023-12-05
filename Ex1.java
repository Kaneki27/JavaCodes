import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        int pen = 10, notebook = 50;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount: ");
        int amount = sc.nextInt();
        if (amount > pen && amount > notebook)
            System.out.println("You can buy both!");
        else if (amount < notebook && amount > pen)
            System.out.println("You can buy a pen!");
        else
            System.out.println("You cannot buy anything");
    }

    // if(amount<10)

    // {
    // System.out.println("Get some cash!");
    // }else if(amount<notebook&&amount>pen)
    // {
    // System.out.println("You can buy 1 thing");
    // }else
    // {
    // System.out.println("You can get both!");
    // }
}
