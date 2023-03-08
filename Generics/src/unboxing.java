public class unboxing {
    public static void main(String[] args) {

        Integer a = new Integer(3);

        int b = a.intValue(); //converting integer into int
        int c = b; // unboxing , now complier will write a.intValue() internally

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
