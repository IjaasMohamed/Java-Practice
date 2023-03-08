package Ex02;

public class Sort <T extends Number>  {
    T t[];

    public void add(T t[]){
        this.t = t;
    }

    public T[] get(){
        return t;
    }
    public void bubblesort(){
        for (int i = 0 ; i < t.length -1 ; i ++)
            for (int j = 0 ; j < t.length - i - 1 ; j++){
                if (t[j].doubleValue() > t[j + 1].doubleValue()){ //checking for the length
                    T temp = t[j];
                    t[j] = t[j+1];
                        t[j+1] = temp;
                }
            }
    }

    public void printArray(){
        for (int i = 0 ; i < t.length; i ++){
            System.out.println(t[i] + " ");
        }
    }

    public static void main(String[] args) {
            Float []farray = {15.6f,16.8f,15.8f,99.9f,101.265f,0.0f,};
            Double []darray= {16.5d,18.0,19.0,15.0,17.0,15.0,18.0};

            Sort <Float> fa= new Sort<> ();
            fa.add(farray);
            fa.bubblesort();
            System.out.println("Float Array elements\n");
            fa.printArray();

            Sort <Double> da = new Sort <> ();
            da.add(darray);
            fa.bubblesort();
            System.out.println("\n ***************************************\n Double array elements \n");
            da.printArray();

    }
}
