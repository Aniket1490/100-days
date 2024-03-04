package Recursion;

public class Palindrome {
    static int sum = 0;
    public static void  rev1(int n){
        if(n==0)return ;
//        int sum = 0;
        int rem = n%10;
        sum = sum*10 + rem;
        rev1(n/10);
    }
    static boolean palin(int n){
        rev1(n);
        return sum==n;

    }
    public static void main(String[] args) {
        System.out.println(palin(1234321));
    }
}
