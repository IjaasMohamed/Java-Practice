public class SingeletonClassDemo {

    static SingeletonClassDemo instance = null;
    public int x = 10;

    private SingeletonClassDemo() {

    }

    static public SingeletonClassDemo getInstance() {
        if (instance == null)
            instance = new SingeletonClassDemo();
        return instance;
    }
}
    class main1 {
        public static void main(String[] args) {
            SingeletonClassDemo s1 = SingeletonClassDemo.getInstance();
            SingeletonClassDemo s2 = SingeletonClassDemo.getInstance();
            s1.x = s1.x+50;
            System.out.println("Value of x in singleton Demo 1: " + s1.x);
            System.out.println("Value of x in singleton demo 2: " + s2.x);
        }
    }

