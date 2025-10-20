class Solution {
    public char findTheDifference(String x, String y) {
       char ans = 0 ;
        for(char i : x.toCharArray()){
            ans^=i;
        }
        for(char i : y.toCharArray()){
            ans^=i;        }
        return ans;
    }
}