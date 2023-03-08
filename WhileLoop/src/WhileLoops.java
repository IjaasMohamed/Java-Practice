import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args) {
        int counter = 0, i = 0;
        String text;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Enter what should be repeated! : ");
        text = sc.nextLine();

        System.out.println("Enter the number of times : ");
        counter = sc.nextInt();

        while (i<counter){
            System.out.println("\n" + text);
            i++;
        }
        System.out.println("End Of the loop");
    }
}
