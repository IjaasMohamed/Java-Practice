import java.io.*;
public class Exercise04 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffi = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length width and height : ");
        int length = buffi.read();
        System.out.println("Enter the length width and height : ");
        int width = buffi.read();
        System.out.println("Enter the length width and height : ");
        int heigth = buffi.read();
        int volume = length*width*heigth;

        System.out.println("Volume would be : " + volume);

    }
}
