public class OverloadingMain {
    public void add(){
        System.out.println("Output Would be null " );
    }
    public void add(int a){
        System.out.println("Output would be : " + a );
    }
    public void add(int a , int b){
        System.out.println("Output would be : " + (a + b) );
    }
    public void add(int a, String b){
        System.out.println("Output would be : " + a + "String value would be : " + b);
    }

    public static void main(String[] args) {
        OverloadingMain overloading;
        overloading = new OverloadingMain();

        overloading.add();
        overloading.add(20);
        overloading.add(20,40);
        overloading.add(45, "Test");
    }
}
