package Exercise1;

public class Calculation {
    private static int val1;
    private static int val2;

    public Calculation(int val1, int val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    public static int addition(){
        System.out.println("Addition : " + (val1 + val2));
        return val1 + val2;
    }
    public static int substraction(){
        System.out.println("Substraction : " + (val1 - val2));
        return val1 - val2;
    }
    public static void add(int n1, int n2){
        System.out.println("\nAddition New : " + (n1 + n2 ) );
    }
    public static void subs(int n3, int n4){
        System.out.println("Substraction new : " + (n3 - n4));
    }
}
