package Exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise3 {
    public static void main(String[] args) {
        int maxSubjects = 0;
        int marks[] = new int[5];
        int total = 0;
        double avg;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the number of subjects : ");
            maxSubjects=sc.nextInt();

            for (int i = 0 ; i < maxSubjects; i++){
                System.out.println("Input the marks for subject " + i + " : ");

                marks[i] = sc.nextInt();
                total = total + marks[i];

            } avg = total / maxSubjects;

            System.out.println("Avg Marks would be : " + avg);
        } catch (InputMismatchException e){
            System.out.println("Invalid Input " +e  );
        } catch (ArithmeticException e){
            System.out.println("Dont Divide integer by Zero" + e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is found outta bound" + e );
        } finally {
            System.out.println("Finally Block executed");
        }
    }
}
