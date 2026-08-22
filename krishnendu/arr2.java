package krishnendu;

import java.util.Scanner;

public class arr2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to store ? :-> ");
        int n = sc.nextInt();

        int[] arr = new int[20];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number : ");
            int k=sc.nextInt();
            arr[i] = k;
        }
        System.out.print("Here is what we got : ");
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i]);
        }
        System.out.println("");
    }
}
