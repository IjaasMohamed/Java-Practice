import java.util.Scanner;

public class Student implements IDisplay, IInput{
    private String studentId;
    private String name;

    Student(){
//        this.studentId = studentId;
//        this.name = name;
    }
    public void print(){
        System.out.print("studentId = " + studentId + " name = " + name);
    }
    public void printDetails(){
        System.out.println("studentId = " + studentId);
        System.out.println("name = " + name);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Student ID please : ");
        this.studentId = sc.next();

        System.out.println("Enter the name Please : ");
        this.name = sc.next();
    }
}
