package Exception;

public class test01 {
    public static void main(String[] args) {
        int d = 0;
        int a;

        try{
            a = 95 / d;
            System.out.println("Invaded : " + a);
        } catch (ArithmeticException e){
            System.out.println("Exception : " + e );
        }


    }
}
