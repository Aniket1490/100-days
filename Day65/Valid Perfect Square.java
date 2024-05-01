class Solution {
    public boolean isPerfectSquare(int num) {
    
        double x = Math.sqrt(num);
        int x1 = (int)x;
        if(x1*x1==num) return true ;
        return false;

        
    }
}