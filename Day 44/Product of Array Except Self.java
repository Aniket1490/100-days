class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] ans = new int [nums.length];
        int pro = 1;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) count++;
           if(nums[i]!=0) pro=pro*nums[i];
        }
        if(count>1){
            Arrays.fill(ans,0);
        }
        else if(count==1){
            for(int i=0; i<nums.length; i++){
            if(nums[i]==0) {
                ans[i]=pro;
            }
            else ans[i]=0;
        }
        }
        else{
            for(int i=0;i<nums.length;i++){
                int pdt=pro;
                pdt=pdt/nums[i];
                ans[i]=pdt;
            }
        }
        
        return ans;
    }
}
