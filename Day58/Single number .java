class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int e:nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
             int k=entry.getKey();
             int v=entry.getValue();
             if(v==1){
                return k;
             }
        }
        return -1;
    }
}