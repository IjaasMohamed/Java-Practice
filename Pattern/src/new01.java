import java.sql.SQLOutput;
import java.util.Scanner;

public class new01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0;

        for (i = 0 ; i < 4 ; i++){
            for (j = 0 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("////////////////////////////////////////////////////////");

        for (int k = 0; k <= 5 ; k ++){
            for (int l = 0 ; l <= k ; l++){
                System.out.print("-  ");
            }
            System.out.println();
        }

        for (int m = 0 ; m <= 4 ; m++){
            System.out.println("*");
        }
        for (int n = 0 ; n <= 12; n = n += 2){
            for (int O = 0; O <= n ; O ++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (float k = 0 ; k < 5; k++) {
            for (float n = 0; n < k; n++) {
                System.out.print("/||| ");
            }
            System.out.println();
        }
        for (int y = 10; y<20;y++){
            for (int z = 12; z < y; z++ ){
                System.out.print("- ");
            }
            System.out.println();
        }

//        for ( i = 0; i < 4; i++) {
//            for ( j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
