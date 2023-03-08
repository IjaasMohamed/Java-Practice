public class Main {
    public static void main(String[] args) {
        Car car = new Ferrari();
        Repair rep = new Repair();
        rep.repair(car);

        car = new Audi();
        rep.repair(car);
    }
}
