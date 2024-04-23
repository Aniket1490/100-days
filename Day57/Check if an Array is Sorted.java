public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        int i=0;
     while(i<n-1){
         if(a[i]>a[i+1]){
             return 0;
         }
         i++;
     }
     return 1;
    }
}