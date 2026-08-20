package krishnendu;

import java.util.Scanner;

public class primenumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : -> ");
        int n = sc.nextInt();
        System.out.println("Entered Number : " + n);

        boolean prime = isPrime(n);
        System.out.println(prime);
    }
    static boolean isPrime(int n){
        System.out.println("Checking if " + n + " is prime...");
        for(int i=2;i<n;i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
