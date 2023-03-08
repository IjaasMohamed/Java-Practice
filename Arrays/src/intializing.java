import java.util.Arrays;
import java.util.Scanner;

public class intializing {
    public static void main(String[] args) {
        //initializng index
        int a [];
        a = new int[5];
        a [0] = 12;
        a [1] = 14;
        a [2] = 16;
        a [3] = 18;
        a [4] = 20;

        for (int i =0; i<a.length; i++){
            System.out.println("Value of array element " + i + " is " + a[i]);
        }
        System.out.println();
        // initializing while creating variable
        int b[] = new int []{1,2,3,4,5};
        for (int i = 0; i < b.length ; i++ ){
            System.out.println("Value of array element " + i + " is " + b[i]);
        }

        System.out.println();

        int c[] = new int[5];

        Arrays.fill(c,5);

        for(int i = 0; i < c.length; i++){
            System.out.println("Value of array element " + i + " is " + c[i]);
        }
        System.out.println();

        //initializing through loops
        int d [] = new int [4];

        for (int i = 0; i< d.length; i++){
            d[i] = i + 10;
            System.out.println("Value of array element " + i + " is " + d[i]);
        }

        int e[] = new int[4];

        for (int i = 0 ; i<e.length ; i++)
            e[i] = i +2;
        for (int i = 0; i < e.length; i++){
            System.out.println("value of array element " + i + " is " + e[i]);
        }

        int[] f = new int [5];
        System.out.println("Enter 5 integer digits");
        for (int i = 0 ; i < f.length ; i++ ){
            Scanner sc = new Scanner (System.in);
            f[i] = sc.nextInt();
        }
        for (int i = 0 ; i < f.length; i ++){
            System.out.println("Value of array Element " + i + " is " + f[i] );
        }

        int x[] = new int[]{5,4,3,2,1};

        int z[] = x;

        System.out.println("**********************************");
        for (int i = 0; i < z.length; i++){
            System.out.println("Value of array Element z[" + i + "] : " + z[i]);
        }

        int y = z[0];

        System.out.println("value of array Element y :" + y );

        int m[] = new int[]{5,4,3,1,1,1};

        displayArray(m);

        int q[] = getArray();
        displayArray(q);
    }
    public static void displayArray(int n[]){
        for (int i = 0 ; i < n.length ; i++){
            System.out.println("Value of array elements m["+i+"] : " + n[i] );
        }
    }

    public static int[] getArray(){
        System.out.println("\n ************************");
        System.out.println("Please enter the values of arrays");
        int [] temp = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < temp.length ; i++)
            temp[i] = sc.nextInt();
        return temp;
    }
}
