public class main  {
    public static void main(String[] args) {
        Book b1 = new Book();
        Student s1 = new Student();
        b1.input();
        s1.input();

        System.out.println("***************");

        b1.print();
        b1.printDetails();

        System.out.println("***************");

        b1.print();
        b1.printDetails();
    }
}
