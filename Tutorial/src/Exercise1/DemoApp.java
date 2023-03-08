package Exercise1;



public class DemoApp {
    public static void main(String[] args) {
        Calculation cal1 = new Calculation(20,10);
        cal1.addition();
        cal1.substraction();

        Calculation cal2 = new Calculation(80,50);
        cal2.addition();
        cal2.substraction();

        Calculation.add(80, 30);
        Calculation.subs(50 , 20);
    }
}
