public class Operators {
    public static void main(String[] args) {
        // simple assignment

        int x = 10;
        int y;
        y = 45;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //chained Assignment

        int a, b , c , d, e, f;
        a = b = c = d = e = f = 100;
        System.out.println("a = " + a  + "b  = " + b + "c  = " +  c + "d  = " + d + "e  = " + e);

        //compound assignment
        
        int g=24;
        g += 45;
        System.out.println("g = " + g);

        byte h = 10;
        h= (byte) ( h + 1) ;
        System.out.println("H = " + h);
        
        byte i = 15;
        i = (byte) (i + 1);
        System.out.println("i = " + i);
        
        byte j = 25;
        j += 35;

        System.out.println("j = " + j);


    }
}
