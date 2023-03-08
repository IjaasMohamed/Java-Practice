import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arrDemo = new ArrayList<>();
        arrDemo.add(1212);
        arrDemo.add(1256);
        System.out.println("arrDemo = " + arrDemo);

        arrDemo.add(85);
        System.out.println("arrDemo = " + arrDemo);

        ArrayList<String> arrDemo1 = new ArrayList<>();
        arrDemo1.add("Bhai");
        arrDemo1.add("Enna");
        arrDemo1.add("Waasiya");
        System.out.println("arrDemo1 = " + arrDemo1);

        System.out.println("Size : " + arrDemo.size());

        System.out.println("****************");

        //arrDemo1.clone();
        System.out.println("Clone" + arrDemo1.clone());

        //arrDemo.clear();
        System.out.println(arrDemo);

        arrDemo1.add(2,"Kasta Kaalam Pola");
        System.out.println("arrDemo1 = " + arrDemo1);

        //arrDemo1.remove(3);

        System.out.println("arrDemo1 = " + arrDemo1);

//        Integer arr[] = new Integer[arrDemo.size()];
//        arr = arrDemo.toArray(arr);
//
//        for (int x = 0 ; x < arr.length; x++){
//            System.out.println("Element " + (x+1) + " is " + arr[x] );
//        }

        for (Integer a : arrDemo){
            System.out.println(a);
        }

        Stack<String> myStack =  new Stack<>();
        myStack.add("Brother");
        myStack.push("Naan Ippa");
        myStack.push("Ondum");
        myStack.add("Seirei");
        myStack.push("Illa");
        myStack.add("Brother");

        System.out.println(myStack);

        //PriorityQueue

        PriorityQueue<Integer> priorityQ = new PriorityQueue<>();
        priorityQ.add(75);
        priorityQ.add(76);
        priorityQ.add(77);
        priorityQ.add(88);
        priorityQ.add(89);

        System.out.println(priorityQ);

        System.out.println("Peek" + priorityQ.peek());
        System.out.println("Peek" + priorityQ.peek());
        System.out.println("Poll" + priorityQ.poll());
        System.out.println("priorityQ = " + priorityQ);
        System.out.println("Poll" + priorityQ.poll());
        System.out.println(priorityQ);

    }
}
