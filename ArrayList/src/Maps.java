import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        HashMap<String,Integer> myMap = new HashMap<>();
        myMap.put("Amal", 2121);
        myMap.put("Kawid", 5454);
        myMap.put("David" , 8564);

        System.out.println(myMap);

        Set<Map.Entry<String,Integer>> mySet =myMap.entrySet();
        for (Map.Entry<String,Integer> Val : mySet){
            System.out.println("Student name would be " + Val.getKey() + " and the ID would be " + Val.getValue());
            System.out.println("Similarly");
            System.out.println("Name = " + Val.getKey());
            System.out.println("Value = " + Val.getValue());
        }
        Integer ak=myMap.get("Kawid");
        myMap.put("Kawid" , ak + 100000000);
        System.out.println("The new id would be " + myMap.get("Kawid"));

        Integer ak1 = myMap.get("David");
        myMap.put("David" , ak1 + 1000000000);
        System.out.println("New Value of david is " + myMap.get("David"));

    }
}
