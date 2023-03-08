import java.util.Scanner;
public class teaser {
    public static void main(String[] args) {

        int counter=1, uInput;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bish enter the fucking input : ");
        uInput = sc.nextInt();

        while ( uInput >= 1 ){
            counter = counter + (counter * (uInput-1));
            uInput--;

        }
        System.out.println("ah : " + counter);

    }
}
