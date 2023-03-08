public class TernaryOperator {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int max = (x > y) ? x : y;
        System.out.println("max = " + max);

        int a = 20 , b = 45;
        float f = (a < b) ? b : (a++);
        System.out.println("f = " + f);

        int c = 55 , d = 49, h = 47;
        float g = (c > d || c > h ) ? 40 : 80;
        System.out.println("g = " + g);

        int m = 25;
        int n = (m > 36) ? 49 : ((m > 46) ? 95 : 00);
        System.out.println("n = " + n);
        
        int p = 45, r = 66;
        int q = (r>p)?22:79;
        System.out.println("q = " + q);
    }
}
