public class creation {
    public static void main(String[] args) {
        //method 1
        char arr[] = {'a','b','c'};
        String s = new String (arr);
        System.out.println("s = " + s);
        
        char [] f = {'m','n','o'};
        String u = new String (f);
        System.out.println("u = " + u);
        
        //method 2
        String x = new String ("abc");
        System.out.println("x = " + x);
        String c = new String ("mno");
        System.out.println("c = " + c);
        
        //method 3
        String y = "abc";
        System.out.println("y = " + y);
    }
}
