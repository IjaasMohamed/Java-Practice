public class ParseInt {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("s = " + s);
        int f = 0;
        try {
            f = Integer.parseInt(s);
        } catch(NumberFormatException e){
            System.out.println("Its kinda bullshit to connect string with int");
            System.out.println(e);
        }
        System.out.println("f = " + f);

        String d = "123";
        int m = Integer.parseInt(d);
        System.out.println("d = " + d);
    }
}
