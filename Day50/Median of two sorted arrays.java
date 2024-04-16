class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = (nums1.length + nums2.length);
        double[] arr = new double[n];
        for(int i=0; i<nums1.length; i++){
            arr[i]=nums1[i];
        }
        for(int i=nums1.length; i<n; i++){
            arr[i]=nums2[i-nums1.length];
        }
        Arrays.sort(arr);
        double med ;
        if(n%2==0){
            double a = arr[n/2];
            double b = arr[(n/2)-1];
             med = (a+b)/2;
            
        }
        else{
             med = arr[n/2];
        }
        return med;
    }
}