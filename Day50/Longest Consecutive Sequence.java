class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int con = 1;
        int cnt = 1;
        if (nums.length == 0) return 0;
        if(nums.length==1) return 1;
         
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 1) {
                cnt++;
            } 
            else if(nums[i+1]==nums[i])continue;
            else {
                cnt = 1;
            }
            con = Math.max(con, cnt);
        }
        return con;
    }
}