class Solution {
    public int findComplement(int n) {
      if(n == 0){
                return 1 ;
            }
        int m = n ;
        int p  = 0 ;
        while(m>0){
            p = p<<1 ;
            p = p|1 ;
            m = m>>1 ;
        }
        return (~n & p);
    }
}