import java.util.Scanner;

public class CodinChall {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter you fucking grade mate : ");
        String grade  = sc.nextLine();

        switch (grade){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Amazing");
                break;
            case "C":
                System.out.println("Well Done");
                break;
            case "D":
                System.out.println("You can do better");
                break;
            default:
                System.out.println("enna pund...da adikirai? Sariya pathu saaathe ");
        }
    }
}
