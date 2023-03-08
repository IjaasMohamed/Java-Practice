package PastPaper;

public class Frodo extends Hobbit {
    public static void main(String[] args) {
        Short myGold = 7;
        System.out.println(countGold(myGold, 6 ));
    }

    static int countGold(int x, int y) {
        return x + y;
    }
}
