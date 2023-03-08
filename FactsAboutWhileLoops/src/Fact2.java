public class Fact2 {
    public static void main(String[] args) {
        while(true); //perfectly fine
        while(true){}//perfectly valid
        while(true){
            int x = 100; //perfectly fine as long as youd dont need to use x outside the scope
        }
        while(true){
            int x = 100; //perfectly fine and x could be used only within the scope not outside
            x +=2;
        }
        while(true){
            int x = 100;//valid as long as x is used within the scope
        }

    }
}
