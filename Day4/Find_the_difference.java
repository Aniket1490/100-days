class Solution {
    public char findTheDifference(String s, String t) {
      char ch[]=s.toCharArray();
      char ch1[]=t.toCharArray();
      char result=0;
      for(int i=0;i<ch.length;i++){
          result^=ch[i];
      }
      for(int i=0;i<ch1.length;i++){
          result^=ch1[i];
      }
      return result;
    }
}