package Exercise4;
/*
Implement a generic method called print which can print any value type. The message will be string.
Below is a version of the print() message that works only for integers.
void print(String message, int val)
e.g. of usage
print(“Age is “, age)  Age is : 2
*/
public class age <T,V> {

    public static void main(String[] args) {
        print("Age is " , 23);
        print("Im " , "Ijaas");
        print(45,18);
    }

    public static <T> void print(T a, T b){
        System.out.println(a +" " + b );
    }
}