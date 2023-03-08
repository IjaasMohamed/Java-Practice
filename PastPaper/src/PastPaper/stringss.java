package PastPaper;
import java.util.*;

public class stringss {
    public static void main(String[] args) {
        String resault = new String ("SLIIT Campus");
        StringBuffer sb = new StringBuffer(resault.toUpperCase().toLowerCase().substring(1,6));
        System.out.println(resault);
        System.out.println(sb);
    }
}
