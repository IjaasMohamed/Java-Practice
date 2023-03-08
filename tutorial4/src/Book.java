import java.util.Scanner;

public class Book implements IDisplay, IInput {
    private String bookId;
    private String title;
    private String publisher;

    public Book( ){
//        this.bookId = bookId;
//        this.title = title;
//        this.publisher = publisher;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Book ID Please : ");
        this.bookId=sc.next();

        System.out.println("Enter the title Please : ");
        this.title = sc.next();

        System.out.println("Enter the Publisher's name : ");
        this.publisher = sc.next();
     }

    public void print(){
        System.out.print("bookId = " + bookId + " title = " + title +" publisher = " + publisher);
    }
    public void printDetails(){
        System.out.println("bookId = " + bookId);
        System.out.println("title = " + title);
        System.out.println("publisher = " + publisher);
    }
}
