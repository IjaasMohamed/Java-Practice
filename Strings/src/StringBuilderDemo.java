public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();


        for (int i = 0 ; i < 5; i++){
            s.append("abc");
        }
        System.out.println(s.replace(0,4,"-"));
    }
}
