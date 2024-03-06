package Sliding_Window;

public class Max_sum_of_subarray_of_size_k {
    public static void main(String[] args) {
        int []arr = {2,3,1,6,3,1,7,1};
        System.out.println( maxSum(arr ,3));

    }
    public static int maxSum(int[] arr , int k){
        int sum=0;
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        while(j<arr.length) {
            sum = sum + arr[j];
            if ((j - i + 1) < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(max, sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return max;
}
