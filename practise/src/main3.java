// Q #7) Write a Java Program to find whether a number is prime or not.


import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
                int temp, num;
                boolean isPrime = true;
                Scanner in = new Scanner(System.in);
                num = in.nextInt();
                in.close();
                for (int i = 2; i == num / 2; i++) {
                    temp = num%i;
                    if (temp == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)
                    System.out.println(num + "number is prime");
                else
                    System.out.println(num + "number is not a prime");
            }
        }
