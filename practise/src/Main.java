 //Q #3) Write a Java Program to swap two numbers using the third variable.
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Value of x & Y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Before swapping x = " + x + " & y= " +y);
        System.out.println("After swap");
        int temp = x;
        x = y;
        System.out.println("After swap x = " + x + " & y = " + temp );
    }
}