class Solution {
    public int reverseBits(int n) {
       int m = 0 ;
       int count = 0 ;
       while(count<31){
        m = m|(n&1) ;
        m = m<<1 ;
        n = n>>1;
        count++ ;
       } 
       return m ;
    }
}