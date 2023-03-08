public class throwsTest {
    public static void main(String[] args) {
        MathOP op = new MathOP();

        try {
            System.out.println( op.divide(5 , 0));
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
