class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minSum = Integer.MAX_VALUE;
        int sum =0;
        int n = nums.length;
        int a=0;
        for(int i=0; i<n-2; i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum==target){
                return sum;
            }
            else if(sum<target){
                j++;
            }
            else{
                k--;
            }            
         
         int diff=Math.abs(target-sum);
            if(diff<minSum){
                minSum=diff;
                a=sum;
            }
        }
        }
        return a;

    }
}