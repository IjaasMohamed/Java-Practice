public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Hey");
        int a =10;
        int b = 5;
        int c = 5;
        int x =  0;
        try {
            x = a / (b - c);
        } catch (ArithmeticException e){
            System.out.println("Bro whats ur school? Fucking idiots : ");
            System.out.println(e);
        } finally {
            System.out.println("Finally sucessfully implemented");
        }
        System.out.println("Bye");
        System.out.println("x = " + x );
        System.out.println("a = " + a);
    }

}
