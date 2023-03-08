public class newSingleton {

    static newSingleton instance = null;

    public static int x = 10;

    private newSingleton() {

    }

    static public newSingleton getInstance() {
        if (instance == null) {
            instance = new newSingleton();
        } else
            return instance;


        return instance;
    }
}
    class main {
        public static void main(String[] args) {
            newSingleton newS = newSingleton.getInstance();
            newSingleton newSS = newSingleton.getInstance();
            newSingleton.x = newSingleton.x + 10;
            System.out.println("VAlue of new S :" + newS);
            System.out.println("Value of new S " + newSS);
        }
    }

