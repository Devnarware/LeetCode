class Solution {
    public int binaryGap(int n) {
        int  count = 0 ;
        int max = 0 ;
        if((n&(n-1)) == 0 || n==0){
            return 0 ;
        }else{
            while(n>0){
                if( (n&1) == 1){
                    count = 1 ;
                }
                else{
                    if(count > 0){
                        count++ ;
                    }
                }
                if(count>max){
                    max = count ;
                }
                n = n>>1 ;
            }
        }
        return max ;
    }
}