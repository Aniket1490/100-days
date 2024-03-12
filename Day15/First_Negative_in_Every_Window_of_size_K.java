package Sliding_Window;

import java.util.*;

public class First_Negative_in_Every_Window_of_size_K {

    public static int []negative(int[]arr,int k, int n){
        int []ans = new int[n];
        List<Integer>l=new ArrayList<>();
        int i=0;
        int j=0;
        while(j<n){
            if(arr[j]<0){
                l.add(arr[j]);
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(l.isEmpty()){
                    ans[i]=0;
                }
                else{
                    if(arr[i]==l.get(0)){
                        ans[i]=l.get(0);
                        l.remove(0);
                    }
                    else{
                        ans[i]=l.get(0);
                    }
                }
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int [n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        int []ans=negative(arr,k,n);
        for(int i=0; i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
