class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []arr = {-1,-1};
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
                if(nums[i]==target){
                    arr[0]=i;
                    break;
                }     
          }
        if(arr[0]!=-1){
            for(int i=nums.length-1; i>=arr[0]; i--){
                if(nums[i]==target){
                    arr[1]=i;
                     break;
                }
            }
        }
        return arr;
    }
}