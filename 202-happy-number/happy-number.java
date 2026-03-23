class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>(); 

        while(true){
            n = helper(n) ;
            if(n == 1){
                return true ;
            }else if(set.contains(n)){
                break ;
            }else{
                set.add(n) ;
            }
        }
        return false ;
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