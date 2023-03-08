public class MainMethod {
    public static void main(String[] args) {
    Car car1 = new Ferrari();
    CarRepair carRepair = new CarRepair();
    carRepair.repair(car1);

    car1 = new Audi();
    carRepair.repair(car1);

    Car ca2 = new Ferrari();
    carRepair.repair(ca2);

    }
}
