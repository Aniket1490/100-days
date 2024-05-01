class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();

         for(int e:nums){
            mp.put(e,mp.getOrDefault(e,0)+1);
         }
         
        for( Map.Entry<Integer,Integer> entry : mp.entrySet()){
            int k =entry.getKey();
            int v = entry.getValue();
            if(v==1) return k;
        }
        return 0;
    }
}