package krishnendu;

import java.util.Scanner;

public class Armstrong {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : -> ");
        int n = sc.nextInt();
        boolean armstrong = IsArmstrongNumber(n);
        System.out.println(armstrong);
    }
    static boolean IsArmstrongNumber(int n){
        int c =0;
        int n1 = n;
        int n2 = n;
        while(n1!=0){
            c++;
            n1/=10;
        }
        double a =0;
        while(n2!=0){
            int l = n2%10;
            a =a +  Math.pow(l,c);
            n2/=10;
        }

        return (n==a);
    }
}
