import java.util.ArrayList;

public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
      
      for(int i=0; i<n-1; i++){
          if(arr[i]!=arr[i+1]){
              list.add(arr[i]);
          }
          else{
              continue;
          }
      }
      list.add(arr[n-1]);
      return list.size();
        
    }
}