class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0 ;
        int setBit ;
        for(int i = left ; i<=right ; i++){
            setBit = countSetBit(i) ;
            if(isPrime(setBit)){
                count++ ;
            }
        }
        return count ;
    }

    int countSetBit(int n){
        int c = 0 ;
        while(n>0){
            n = n&(n-1) ;
            c++ ;
        }
         return c ;
    }


    boolean isPrime(int n){
        if(n==1){
            return false ;
        }
        for(int i = 2 ; i*i<=n ; i++){
            if(n%i == 0){
                return false ;
            }
        }
        return true ;
    }

}