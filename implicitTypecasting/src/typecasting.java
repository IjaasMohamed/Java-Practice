public class typecasting {
    public static void main(String[] args) {
        //implicit = done by the machine, it converts smaller data type to larger data type automatically
        int a = 77;
        float b ;
        b = a;
        System.out.println("b = " + b);
        
        byte c = 98;
        int d = c;
        System.out.println("d = " + d);

        char e = 'l' , f = 'a' , g = 49, h = 'P';
        int i = e, j = f , k = g, l = h;
        System.out.println("i = " + i + "\n" +  "j = " + j + "\n" + "k = " + k + "\n" + "l = " +  "\n"  );
    //Explicit typecasting = done by the programmer and we have to specifically mention the transformation

        float x = 94;
        byte y = 0;
        y = (byte) x ;

        System.out.println("y = " + y);

        double z = 152.954;
        float m = (float)z;
        System.out.println("m = " + m);
        
        int n = 94;
        char o = (char)n;
        System.out.println("o = " + o);

    }
}
