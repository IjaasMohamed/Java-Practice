package Exercise01;

public class Exercise {
    void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i < n - 1 ; i ++)
            for (int j = 0; j < n - i - 1 ; j ++){
                if (arr[j] > arr[j + 1]){
                    //swap arr [j+1] and arr[i]
                    int temp = arr [j];
                    arr[j] = arr [j + 1 ];
                    arr [ j + 1 ] = temp;
                }
            }
    }

    public static void main(String[] args) {
        int [] arr = {75,76,77,78,79,80,81,82,83,84};

        Exercise e = new Exercise();
        e.bubbleSort(arr);

        System.out.println("***********");
        for(int i = 0 ; i < 10 ; i ++ ){
            System.out.println(arr[i] + " ");
        }
    }
}
