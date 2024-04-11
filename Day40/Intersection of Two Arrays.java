class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length+nums2.length;
        ArrayList<Integer> arr = new ArrayList<>();
        int k =0;
        HashSet<Integer> h1 = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
           for(int j=0; j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                h1.add(nums1[i]);
            }
           }
        }
        for(Integer num: h1){
            arr.add(num);
        }
        int size = arr.size();
        int []ans = new int [size];
        for(Integer num: arr){
            ans[k++]=num;
        }
        return ans;
    }
}