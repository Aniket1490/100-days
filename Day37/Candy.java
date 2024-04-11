class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
            int []arr1 = new int[n];
            Arrays.fill(arr1,1);

            int [] arr2 = new int[n];
            Arrays.fill(arr2,1);

            for(int i=0;i<n-1; i++){
                if(ratings[i+1]>ratings[i]){
                    arr1[i+1]=arr1[i]+1;
                }
            }
            for(int i=n-1 ;i>0; i--){
                if(ratings[i-1]>ratings[i]){
                    arr2[i-1]=arr2[i]+1;
                }
            }
           int max = 0;
           for(int i=0; i<n; i++){
           max+=Math.max(arr1[i],arr2[i]);
           }
           return max;
    }
}