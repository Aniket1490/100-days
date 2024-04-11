class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     int n= temperatures.length;
     int []arr = new int [n];
     Stack<Integer> st = new Stack<>();
     arr[n-1]=0;
     st.push(n-1);
     for(int i=n-2; i>=0; i--){
        while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
            st.pop();
        }
        if(st.isEmpty()){
            arr[i]=0;
        }
        else{
            arr[i]=st.peek()-i;
        }
        st.push(i);
     }   
     return arr;
    }
}