package Exception;

public class Exception {
    public static void main(String[] args) {
        int f = 0;
        int j = 42;


        try{
            int m = j/f;
        }
        catch(ArithmeticException e){
                System.out.println("doesnt fucking work " + e);
            }
        }
    }

