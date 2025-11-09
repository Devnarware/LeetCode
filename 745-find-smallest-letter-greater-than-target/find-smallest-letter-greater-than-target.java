class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length ;
        int s = 0 ;
        int e = n-1 ;
        while(s<=e){
            int mid = s + (e-s)/2 ;

            if(letters[mid]>target){
                e = mid-1 ;
            }else{
                s = mid + 1 ;
            }
        }
        return letters[s%n] ;
    }
}