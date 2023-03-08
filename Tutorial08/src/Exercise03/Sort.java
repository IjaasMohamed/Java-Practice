package Exercise03;

public class Sort {
    public <T extends Number> void bubblesort(T[] elements) {

        for (int i = 0 ; i < elements.length -1 ; i ++)
            for (int j = 0 ; j < elements.length - i - 1 ; j++){
                if (elements[j].doubleValue() > elements[j + 1].doubleValue()){ //checking for the length
                    T temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                }
            }

    }

    public <T extends Number> void prints( T[] elements){
        for (T elem : elements){
            System.out.println(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer i [] = {12,15,17,19,21,23,25,27};
        Double d [] = {10.0 , 12.0 , 15.0 , 18.0 , 12.6 , 12.9};

        Sort so = new Sort();
        so.bubblesort(i);
        so.prints(i);
        System.out.println("*********************************");
        so.bubblesort(d);
        so.bubblesort(d);

    }
}
