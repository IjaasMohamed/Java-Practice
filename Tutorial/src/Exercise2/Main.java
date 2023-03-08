package Exercise2;

public class Main {
    public static void main(String[] args) {

//        Feet newFeet = new Feet(20,50);
//        newFeet.print();

        Feet nF1 = new Feet(5 , 6 );
        Feet nF2 = new Feet(6 , 7);
        Feet nF3 = new Feet(0, 0 );
        nF3.add(nF1, nF2);
        nF3.print();

    }
}
