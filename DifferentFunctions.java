public class DifferentFunctions {
    public static void main(String[] args) {
        String FirstN = "Arya";
        String SecondN = "Chavan";
        String name3 = FirstN + "and" + SecondN;
        // Concatenation
        System.out.println(name3);

        // CharAt
        System.out.println(FirstN.charAt(0));

        // Replace
        String Replace = FirstN.replace("Arya", "Ken");
        System.out.println(Replace);

        // Substring
        String name4 = "Pen and Paper";
        System.out.println(name4.substring(0, 3));
    }
}
