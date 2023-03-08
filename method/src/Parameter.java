public class Parameter {
    public static void main(String[] args) {

        names("Maina", 10);
        String g = "kudha";
        int f = 20;
        String h = "David";
        int m = 12;
        names (g,f);
        names(h,m);
    }
    public static void names(String name,int count){
        for(int i = 0; i< count; i++) {
            System.out.println(name + i);
        }
    }
}
