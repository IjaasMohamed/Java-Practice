import java.util.Scanner;
public class afterLunch {
    public static void main(String[] args) {
        int count = 1 ,i=1, factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        count = sc.nextInt();
        
        while (count >= i){
            factorial = factorial + (factorial * i);
            i++;
            System.out.println("factorial = " + factorial);
        }
        System.out.println("factorial = " + factorial);
    }
}
