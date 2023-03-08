import java.io.*;

public class BufferedClass{
    public static void main(String[] args) throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Whats ur favourite plant? ");
        String name = bR.readLine();
        System.out.println("name = " + name);
    }
}