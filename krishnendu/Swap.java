package krishnendu;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
         // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a + " " + b);
        System.out.println("Swapped nummbers" + "a" + a + "b" +  b);
        swap(a,b);
        System.out.println("Swapped nummbers" + "a" + a + "b" +  b);
    }

    static void swap(int a , int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped nummbers" + "a" + a + "b" +  b);
    }

}