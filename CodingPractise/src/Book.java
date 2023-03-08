public class Book implements Printable {
    private String Bookid;
    private int numOfPages;
    private double price;

    Book(String Bookid, int numOfPages,double price  ){
        this.Bookid = Bookid;
        this.numOfPages = numOfPages;
        this.price = price;
    }

    public void print(){
        System.out.println("BookId : " + Bookid);
        System.out.println("Number of pages " + numOfPages);
        System.out.println("Price : " + price);
    }

}
