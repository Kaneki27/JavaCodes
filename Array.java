import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] marks = new int[3];
        // int phy = 97
        // int chem = 96
        // int math = 95
        marks[0] = 97;
        marks[1] = 96;
        marks[2] = 95;

        // sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

    }
}
