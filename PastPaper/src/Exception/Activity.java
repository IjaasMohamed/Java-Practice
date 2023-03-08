package Exception;

public class Activity {
    public static void main(String[] args) {
        try{

            String st = "K777K";

            int number = Integer.parseInt(st);
        } catch (NumberFormatException e){
            System.out.println("\n***********\n"  + e);
        }


    }
}
