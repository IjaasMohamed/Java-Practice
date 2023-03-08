public class OB1 {
    String name;
    int age;
    public double gpa;
    static String path;

    public void display(){
        System.out.println(name + "\n" + gpa);
    }
    public OB1(){
        System.out.println("Default COns");
    }

    public static String Nigga(String Nigga){

        System.out.println("Niggi = " + Nigga);
        return "FUckU";
    }

    public static void sow(){
        OB1.sow();
        OB1.blacky();

        OB1 cs = new OB1();
        cs.jayawar();
    }

    public static void blacky(){
        OB1.sow();
    }
    public void jayawar(){
        OB1.blacky();
    }
}
