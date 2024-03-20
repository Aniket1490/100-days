class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> l1 = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        int j = 1;
        int count = 1;
        while(i<n && j<n){
            if(nums[i]==nums[j]){
                count++;
                if(count<=2){
                l1.add(nums[i]);
            }
        }
        else{
            l1.add(nums[i]);
            count=1;
        }
        i=j;
        j++;
        }
        if(i<n){
            l1.add(nums[i]);
        }
        for(int k=0; k<l1.size(); k++){
            nums[k]=l1.get(k);
        }
        return l1.size();
    }
}