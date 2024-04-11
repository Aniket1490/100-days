package Sliding_Window;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first=0;
        int second =1;

        for(int i=0; i<n;i++){
           int third = first+second;
            System.out.print(first+" ");
           first=second;
           second =third;
        }
    }
}
