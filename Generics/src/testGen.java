public class testGen <T>{
    T Gen;

    T add(T Gen){
        this.Gen = Gen;
        System.out.println("Gen = " + Gen);
        return Gen;
    }
}
