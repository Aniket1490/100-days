package Stacks;
import java.util.*;

public class Stock_Span {
    public static int[] stock(int []arr){
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        res[0]=1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.size()>0){
                res[i]=i-st.peek();
            }
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int r[] = (stock(arr));
        for(int i=0; i<arr.length; i++){
            System.out.print (r[i]+" ");
        }
    }
}
