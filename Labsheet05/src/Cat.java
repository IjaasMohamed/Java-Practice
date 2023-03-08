public class Cat extends Animal{
    Cat(){
        System.out.println("Default constructor for Cat class called");
    }
    public Cat(String name) {
        super(name);
    }
    public String speak() {
        return "Meow Meow";
    }
}
