public class BreakStatements {
    public static void main(String[] args) {
        for (int x = 0; x <= 8 ; x++){
            if(x == 2){
                break;
            }
            System.out.println("x = " + x);
        }
        System.out.println("outta loop ");

        int j = 0;
        while(j!=18){
            j++;
            System.out.println("j = " + j);
            if (j==15){
                break;
            }
        }
    }
}
