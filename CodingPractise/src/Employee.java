public class Employee extends Details implements Printable {
    private String Empid;
    private String name;
    private int age;

    Employee(String Empid , String name, int age){
        this.Empid = Empid;
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println("Empid : " +Empid);
        System.out.println("Name : " + name);
        System.out.println("age : " + age);
    }
}
