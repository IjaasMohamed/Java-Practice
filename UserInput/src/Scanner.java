import java.util.Scanner;
 class Scanner1 {
     public static void main(String[] args) {
         String firstStr;
         Scanner sc = new Scanner(System.in);
         firstStr = sc.nextLine();
         System.out.println("Hey " + firstStr);

         int a;
         System.out.println("What is ur age? ");
         a = sc.nextInt();
         System.out.println("Aaha so u are " + a + "Years old e");

     }
}
