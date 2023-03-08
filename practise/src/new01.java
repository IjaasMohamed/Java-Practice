import java.util.Scanner;

class new01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fac = 0;

        for (int i = 1 ; i < N ; i ++ ){
            fac = fac + N * N ;
        }
        System.out.println(fac);
    }
}