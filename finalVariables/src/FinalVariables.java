public class FinalVariables {

    final static int staticDemo ;
    static int staticDemo1;

    static {
        staticDemo = 75;
        System.out.println("INside static block");
    }

    int finaldemo ;
    final int finaldemo1 = 70;
    
    final int k;
    {
       // k = 200;
        System.out.println("New 2020");
    }
    public FinalVariables(){
        k = 75;
        System.out.println(k);
    }

    public static void main(String[] args) {
        int a = 0;
        System.out.println("FinalVariables.main");
        System.out.println("a = " + a);
        System.out.println("a" + a);
        final int b = 90;
        System.out.println(b);
        final int c = 75;
        System.out.println(c);

        FinalVariables fn =new FinalVariables();

        System.out.println(fn.finaldemo);

        FinalVariables fn1 = new FinalVariables();
        System.out.println(fn1.finaldemo1);

        System.out.println();

        FinalVariables fv = new FinalVariables();
        FinalVariables fv1 = new FinalVariables();
        FinalVariables fv2  = new FinalVariables();
        FinalVariables fv3 = new FinalVariables();

        fv3.method1(100);

    }

    public void method1(final int a){
        System.out.println("a = " + a);
    }

}
