package Stacks;
import java.util.*;
public class Remove_consecutive_subsequence {
    public static void main(String[] args) {
    int arr[] = {1, 2, 2, 3, 6, 6, 6, 18, 11, 9, 9, 7};
    int []res = remove(arr);
    for(int i =0; i<res.length; i++){
        System.out.print(res[i]+" ");
    }

}
public static int[] remove(int[]arr) {
    Stack<Integer> st = new Stack<>();
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        if (st.size() == 0 || st.peek()!=arr[i]) {
            st.push(arr[i]);
        }
        else if (arr[i] == st.peek()) {
            if (i==n-1 || arr[i] != arr[i + 1]) st.pop();
        }

    }
    int[] res = new int[st.size()];
    int m = res.length;
    for (int i = m-1; i>= 0; i--) {
        res[i] = st.pop();
    }
    return res;
}
}
