public class StaticOb {

    public static void main(String[] args) {

        OB1 ob = new OB1();
        ob.name="Malkuddus";
        ob.age = 22;
        ob.gpa = 35.2;

        ob.display();
        ob.path = "CS";
        
        OB1.path = "IT";
        System.out.println(OB1.path);

        OB1 newbie = new OB1();
        System.out.println(newbie.path);

        System.out.println(OB1.Nigga("Black Brother Muqrdeen"));
    }
}
