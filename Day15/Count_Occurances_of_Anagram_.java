
class Solution {

    int search(String pat, String txt) {
        int k=pat.length();
        Map<Character,Integer>mp=new HashMap<>();
        for(char c:pat.toCharArray()){
             if(!mp.containsKey(c)){
                 mp.put(c,1);
             }
             else{
                 mp.put(c,mp.get(c)+1);
             }
        }
        int i=0;
        int j=0;
        int ans=0;
        int cnt=mp.size();
        int n=txt.length();
        while(j<n){
            char c1=txt.charAt(j);
            if(mp.containsKey(c1)){
                mp.put(c1,mp.get(c1)-1);
                if(mp.get(c1)==0){
                    cnt--;
                    
                }
            }
            if(j-i+1<k){