class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == dividend ){
            return 1 ;
        }
        long n = Math.abs((long) dividend) ;
        long d = Math.abs((long) divisor) ;
        boolean sign = true ;
        if(dividend>0 && divisor<0){
            sign = false ;
        }
        if(divisor>0 && dividend<0){
            sign = false ;
        }
        long ans = 0 ;
        long p  ;
        while(n >= d){
            p = 0 ;
            while((d<<(p+1))<=n){
                p++ ;
            }
            ans = ans+(1L<<p) ;
            n -= (d<<p) ;
        }
        if(ans>Integer.MAX_VALUE && sign){
            return Integer.MAX_VALUE ;
        }else if(ans>Integer.MAX_VALUE && !sign)
        {
            return Integer.MIN_VALUE ;
        }
        if(!sign){
            return (int)ans*(-1) ;
        }
        return (int)ans ;
    }
}