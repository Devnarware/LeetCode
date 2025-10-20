class Solution {
    public char findTheDifference(String x, String y) {
       char ans = 0 ;
       for(int i = 0 ; i<x.length() ; i++){
           ans = (char)(ans^x.charAt(i) );
       }
       for(int i = 0 ; i<y.length() ; i++){
           ans = (char)(ans^y.charAt(i) );
       }
       return ans ;
    }
}