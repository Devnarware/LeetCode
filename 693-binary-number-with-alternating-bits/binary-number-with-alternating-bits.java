class Solution {
    public boolean hasAlternatingBits(int n) {
        int ans = n&1 ;
        while(n>0){
            if((n&1) == ans){
                ans = ans^1 ;
                n = n>>1 ;
            }
            else{
                return false ;
            }
        }
        return true ;
    }
}