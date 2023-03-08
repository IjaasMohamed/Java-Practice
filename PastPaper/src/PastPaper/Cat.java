package PastPaper;

public class Cat {

    public String name;

    public void parseName(){
        System.out.println("1");

        try {
            System.out.println("2");
            int x = Integer.parseInt(name);
            System.out.println("3");

        } catch (NumberFormatException e ) {
            System.out.println("4");

        }
        System.out.println("5");


    }
    public static void main(String[] args) {
        Cat felix = new Cat();
        felix.name = "Felix";
        felix.parseName();
        System.out.println("6");
    }
}
