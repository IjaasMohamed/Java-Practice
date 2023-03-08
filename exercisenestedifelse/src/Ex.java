import java.util.Scanner;
public class Ex {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Kindly enter you fucking age");
        age = sc.nextInt();

        if (age < 18 ){
            System.out.println("Ineligible");
        }
        else if (age >= 25 && age < 55 ){
            System.out.println("Saving account");
        }
        else if (age > 55 ) {
            System.out.println("Seniors Account");
        }
        }
    }

