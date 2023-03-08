public class test {
    static int a = 3;
    static int b;
    static void meth(int x){
        System.out.println("x = " + x);
        System.out.println("b = " + b);
        System.out.println("c = " + a);
    }
    static {
        System.out.println("Static Block Initiated Bish Please");
        b = a* 4;
    }

    public static void main(String[] args) {
        meth(42);
    }
}
