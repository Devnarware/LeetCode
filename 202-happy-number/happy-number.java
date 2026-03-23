class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n ;
        while(true){
            slow = helper(slow) ;
            fast = helper(fast) ;
            fast = helper(fast) ;

            if(fast == 1){
                return true ;
            }else if(fast == slow){
                return false ;
            }
        }
    }


    private int helper(int n ){
        int sum = 0 ;
        while(n>0){
            int last_digit = n%10 ;

            sum = sum + (last_digit * last_digit) ;
            n = n/10 ;
            

        }
        return sum ;
    }
}