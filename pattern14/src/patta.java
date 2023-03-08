import java.util.Scanner;

public class patta {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        for (int i = 0; i <= 4 ; i++){
            for(int j = 0 ; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k = 0; k< 8 ; k++){
            for (int l = 0; l<k;l++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
