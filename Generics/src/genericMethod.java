public class genericMethod {
    public static <E1E> void getArray(E1E[] elements){
        for(E1E elem : elements) {
            System.out.println(elem + " ");
        }
    }

    public static <F> void reArray(F[] elements){
        for (F elem : elements){
            System.out.println(elem + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {12,15,18,12,15,15,45};
        Character [] charArray = {'S','L','I','I','T'};

        getArray(intArray);
        getArray(charArray);

        String[] f = {"TestString"};
        Double[] g = {12.3,12.4,12.5,12.6,12.7,12.7};
        String [] h = {"Find the missing number in the below sequence"};

        reArray(f );
        System.out.println("\n");
        reArray(h);
        reArray(g);

        System.out.println("Laaaaaaaaaaaaaaaaaaalaaaaaaaaaaaaaaaalaaaaaaaaaaaaaaaaaaaaaa");
    }
}
