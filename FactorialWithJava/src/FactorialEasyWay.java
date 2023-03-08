import java.util.Scanner;
public class FactorialEasyWay {
    public static void main(String[] args) {
        int factorial = 1 , count = 1, i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fucking numeral bish : ");
        count = sc.nextInt();
        while(count>=i) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial is : " + factorial);
        }
    }
