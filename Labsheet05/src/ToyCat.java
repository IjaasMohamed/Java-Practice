public class ToyCat extends Cat {
    String manufacturer;

    ToyCat(){
        System.out.println("Default Constructor for Toycat class called");
    }
    public ToyCat(String name, String manufacturer) {
        super(name);
        this.manufacturer = manufacturer;
    }
    public void display() {
        super.display();
        System.out.println("I am from " + manufacturer + ".");
    }
}
