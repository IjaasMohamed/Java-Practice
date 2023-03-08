import java.util.HashSet;
import java.util.TreeSet;

public class hasSetDemo {
    public static void main(String[] args) {

        HashSet<String> myHash = new HashSet<>();
        myHash.add("Amal");
        myHash.add("Nimal");
        myHash.add("Kamal");
        myHash.add("Amal");
        myHash.add("Nmal");

        System.out.println(myHash);
        System.out.println(myHash.isEmpty());

        for(String val: myHash){
            System.out.println("val = " + val);
        }

        TreeSet<String> myT = new TreeSet<>();
        myT.add("J");
        myT.add("A");
        myT.add("Jak");
        myT.add("B");
        myT.add("Va");

        System.out.println("myT = " + myT);

        for(String a : myT){
            System.out.println(a);
        }
    }
}
