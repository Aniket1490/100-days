package Recursion;

public class Sum_n_Naturals {
    public static void main(String[] args) {
        System.out.println(sum_naturals(5));
    }
    public static int sum_naturals(int n ){
        if(n==1)return 1;
        return n+sum_naturals(n-1);
    }
}
