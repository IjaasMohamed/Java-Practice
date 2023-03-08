final public class classes {
    void Demo(){
        int a = 20;
        System.out.println("What up! " + a); // methods could not be overidden in final classes by default
        a = 30; // variables in final classes are not made final
    }
}
class test extends classes{
    // will not be able to inherit the class if the final keyword is used
}
