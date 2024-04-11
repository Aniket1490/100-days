package Sliding_Window;

public class Question5 {
    public static void main(String[] args) {
        int n=50;
    for(int i=1;i<n;i++){
        if(isPrime(i)){
            System.out.println(i);
        }
    }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}



