public class Statements {
    public static void main(String[] args) {
        int age = 15;
        if (age > 13) {
            System.out.println("Welcome to my website");
        } else {
            System.out.println("You should be over 13 years to view its content");
        }
        System.out.println("Please leave a feedback");

        int i = (age > 13) ? 45 : 95;
        System.out.println("I = " + i);
    }
}
