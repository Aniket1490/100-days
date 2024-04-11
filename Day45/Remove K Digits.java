class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        if(num.length()==k) return "0";
        
        for(int i=0; i<num.length(); i++){
           
        while(!st.isEmpty() && k>0 && st.peek()>num.charAt(i)){
            st.pop();
            k--;
        } 
         st.push(num.charAt(i));
        }
       
        
        while(k>0){
            st.pop();
            k--;
        }   
        StringBuilder s = new StringBuilder();
        while(!st.isEmpty()){
            s.insert(0,st.pop());
        }
        // System.out.print(s);
        while(s.length()>1 && s.charAt(0)=='0'){
            s.deleteCharAt(0);
        }
        return s.toString();
         
    } 
}