public class Ex01 {
    public static void main(String[] args) {
        int miles = 26, yards = 385;
        double kilometer;

        kilometer = (miles * 1.609) + (yards * 1.609 / 1760);
        System.out.println("kilometer = " + kilometer);
    }
}
