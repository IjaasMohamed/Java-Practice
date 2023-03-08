public class MyMain {
    public static void main(String[] args) {
        Employee e = new Employee("ST1105" , "Jannath Hussain" , 28);
        Book b = new Book("Harry The freakinf fucking potter" , 299, 39.25);

        e.print();
        System.out.println("****************************");
        b.print();
    }
}
