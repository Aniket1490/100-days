class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        LinkedList<Integer> l1 = new LinkedList<>();
        HashSet<Integer> mp = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            mp.add(nums[i]);
        }
        for(int i=1; i<=nums.length; i++){
            if(!mp.contains(i)){
                l1.add(i);
            }
        }

    return l1;
   
    }
}