package Recursion;

public class Product_of_Given_Digits {
    public static void main(String[] args) {
        System.out.println(product(1342));
    }
    public static int product(int n){
        if(n==0)return 1;
        return (n%10)*product(n/10);
    }
}
