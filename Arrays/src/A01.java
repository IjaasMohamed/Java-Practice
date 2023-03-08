public class A01 {
    public static void main(String[] args) {
        int a [];
        int[] b;
        a= new int [5];
        b = new int [5];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for (int i = 0; i < a.length; i++){
            System.out.println("Value of array element " + i + " is " + a[i]);
        }
        for (int j = 0 ; j < b.length ; j++){
            b[j] =+ 5;
            System.out.println("Value of array Element " + j + " is " + b[j]);
        }
        int c[] = new int []{12,24,36,48};
        for (int l = 0 ; l<c.length; l++){
            System.out.println("Value of array element " + l + " is " + c[l]);
        }
        int d [] = new int []{001,002,003};
        for (int m = 0 ; m < d.length; m++){
            System.out.println("value of array element " + m + " is " + d[m]);
        }
        int e[] = new int [3];
        for (int n = 0 ; n<e.length; n++) {
            e[n] += e[n] + 100;
            System.out.println("Value of array element " + n + " is " + e[n]);
        }
    }
}
