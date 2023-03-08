public class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Default Constructor for dog class called");
    }
    public Dog(String name) {
        super(name);
    }
    public String speak() {
        return "Bow Wow";
    }

}
