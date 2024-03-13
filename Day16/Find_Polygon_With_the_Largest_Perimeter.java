class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        for(int i=nums.length-1; i>=2;i--){
            long newsum=sum-nums[i];
            if(newsum>nums[i]){
                return sum;
            }
            sum=newsum;
        }
        return -1;
    }
}