public class Fact1 {
    public static void main(String[] args) {
        while (true){} //perfectly valid since it returns a boolean value
        while (1){} //invalid since the value should be in boolean
        while(-1){} //invalid since the value is in int but requires a boolean
    }
}
