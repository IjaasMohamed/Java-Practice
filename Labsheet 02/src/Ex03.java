import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length width and height nigga! : ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        double volume = (length*width*height);
        System.out.println("volume = " + volume);


    }
}
