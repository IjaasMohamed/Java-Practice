import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ifelseifelse {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input age : ");
        age = sc.nextInt();
        if (age > 13 ){
            System.out.println("Welcome to my website");
            if (age <= 25 && age >= 20){
                System.out.println("Congratulations you have win the fucking voucher, now go to hell");
            }
        }
        else if (age == 13 ){
            System.out.println("Enter your fucking email");
        } else {
            System.out.println("Ayyo innam 13 waruwas awim illa, sinna bakuten");
        }
        System.out.println("Please leave some feedback");
    }
}
