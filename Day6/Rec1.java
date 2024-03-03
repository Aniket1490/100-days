
package Recursion;

public class Rec_1 {
    public static void main(String[] args) {
        printBoth(5);
    }
    public static void printlgatar(int n ){       // 1 2 3 4 5
        if(n==0){
            return;
        }
        printlgatar(n-1);
        System.out.println(n);

    }
    public static void printreverse(int n ){     // 5 4 3 2 1
        if(n==0){
            return;
        }
        System.out.println(n);
        printreverse(n-1);

    }
    public static void printBoth(int n ){  // 5 4 3 2 1 1 2 3 4 5
        if(n==0){
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }

}
