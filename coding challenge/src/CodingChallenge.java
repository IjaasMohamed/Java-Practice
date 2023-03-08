import java.util.Scanner;

public class CodingChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an integer numeral : ");
        int uInput = sc.nextInt();

        for (int i =1; i <= 10 ; i++){
            System.out.println(uInput + " * " + i +  " = " + (uInput * i));
        }
    }
}
