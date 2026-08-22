package krishnendu;

import java.util.Scanner;

public class countUsingRecursion {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to count :-> ");
    int i = sc.nextInt();
    count(i);
    }
    static void count(int i){
        if(i==0){
            return ;
        }
        System.out.println(i);
        count(i-1);
    }
}