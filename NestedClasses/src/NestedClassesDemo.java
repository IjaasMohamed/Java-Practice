import jdk.dynalink.beans.StaticClass;

public class NestedClassesDemo {
    int x = 75;
    int y;
    static int z;

     void meth1(){
     int j=75;
         System.out.println(j);
    }

    class Nested{
        void meth2(){
            System.out.println(x);
            System.out.println(y);
        }
        int m = 75;

    }
    static class StaticDemo{
         void method1(){
//             System.out.println(x);
             System.out.println(z);
         }
    }

    public static void main(String[] args) {
         NestedClassesDemo NestedDemp = new NestedClassesDemo();
        System.out.println();
        System.out.println("NestedClassesDemo.main");


         NestedClassesDemo.Nested nested = NestedDemp.new Nested();
         nested.meth2();
         NestedDemp.meth1();

         NestedClassesDemo.StaticDemo sd = new NestedClassesDemo.StaticDemo();
         sd.method1();

    }
}
