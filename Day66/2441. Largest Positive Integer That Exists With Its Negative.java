class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        // int n = nums[0];
        // int ans = -1*n;
       for(int i=0; i<nums.length; i++){
           for(int j=nums.length-1; j>i; j--){
                if(-1*nums[i]==nums[j]){
                    return nums[j];
                }
           }
          }
          return -1;
       }
        
    }
