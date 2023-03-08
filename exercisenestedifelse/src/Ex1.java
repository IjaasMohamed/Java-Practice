import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        int age;
        Scanner mx = new Scanner (System.in);
        System.out.println("Please be kind enough to enter ur fuqing age bish : ");
        age = mx.nextInt();

        if (age > 21){
            if (age > 55 ){
                System.out.println("senior citizen account");
            }
            else if (age >25 && age <55) {
                System.out.println("Saving account");
            }
            else if (age < 21 ){
                System.out.println("Ineligble");
            }

        }
    }
}
