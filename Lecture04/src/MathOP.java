public class MathOP {
    int x;
    int y;

    void add(int x,int y){
        System.out.println("  " + (x+y) );
    }
    int divide(int x , int y) throws ArithmeticException{
        System.out.println("  " + (x / y));
        return x/y;
    }
}
