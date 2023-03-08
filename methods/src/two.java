public class two {
    public static void main(String[] args) {
        displayName("Maina" , 5);
        displayName("Jo"  , 4);
        String name1 = "Jill-ba";
        displayName(name1, 8);

    }
    public static void displayName(String name, int counter){
        for (int i = 0; i< counter ; i++ ){
            System.out.println(i + " name : " + name);
        }
    }
}
