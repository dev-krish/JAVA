package krishnendu;

import java.util.Scanner;

public class Main {
    public static void main(String[] argsjava) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a=sc.nextInt();
        System.out.println("Enter the second number : ");
        int b=sc.nextInt();
        System.out.println("Enter the third number : ");
        int c=sc.nextInt();

        if(a>b) {
            if (b > c) {
                System.out.println(a + " is the largest number");
            } else if (c > a) {
                System.out.println(c + " is the largest number");
            }
        }
        else if (b>c){
            System.out.println(b + " is the largest number");
            }
        else{
            System.out.println(c + " is the largest number");
        }
    }
}