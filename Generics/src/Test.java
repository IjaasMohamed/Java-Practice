public class Test {
    public static void main(String[] args) {
        myGen <Integer> m = new myGen<>();
        m.add(12);
        System.out.println(m.get());

        myGen<String> n = new myGen();
        n.add("Hello World");
        System.out.println(n.get());

        myGen<Double> o = new myGen<>();
        o.add(45.6);
        System.out.println("o.get() = " + o.get());

        testGen<String> p = new testGen<>();
        p.add("New Hello World");

        testGen<Double> q = new testGen<>();
        q.add(88.8);

    }
}
