package PastPaper;

public class printB {
    public static void main(String[] args) {
        Thread a = new printA();
        a.start();
        System.out.println("B");
    }
}
