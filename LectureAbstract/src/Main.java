public class Main {
    public static void main(String[] args) {
        triangle t = new triangle();
        t.setLength(20);
        t.setBreadth(10);
        System.out.println("Area of the trianlge : " + t.getArea());
        System.out.println("\n*****************\n");
        Rectangle r = new Rectangle();
        r.setBreadth(2);
        r.setLength(3);
        System.out.println("Area of the Rectangle : " + r.getArea());
        System.out.println("\n*********************\n");



    }
}
