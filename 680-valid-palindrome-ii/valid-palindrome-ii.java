class Solution {
    public boolean validPalindrome(String s) {
        
        int i = 0 ;
        int j = s.length() - 1 ;

        while(i < j){

            int left = i ;
            int right = j ;

            if(s.charAt(left) != s.charAt(right)){
                // special function call
                return palindrome(left + 1, right, s) || palindrome(left, right-1, s) ;

            }
            else{

                i++ ;
                j-- ;

            }

        }

        return true ;

    }

    private boolean palindrome(int i, int j, String s){

        while(i < j){

            if(s.charAt(i) != s.charAt(j)){
                return false ;
            }
            else{
                i++ ;
                j-- ;
            }
        }
        return true ;
    }
}