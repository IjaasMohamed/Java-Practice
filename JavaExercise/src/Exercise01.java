import java.util.Scanner;
public class Exercise01 {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age bish : ");
        input = sc.nextInt();

        if(input>=21){
            System.out.println("Eligible ");
        } else{
            System.out.println("Ineligible da sinna kerien");
        }
    }
}
