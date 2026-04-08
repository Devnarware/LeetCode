class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0 ;
        int n = s.length() ;
        int maxC = 0 ;
        int[] arr = new int[26] ;
        int i = 0 ;
        for(int j = 0 ; j<n ;j++){
            char c = s.charAt(j) ;

            arr[c-'A'] = arr[c-'A'] + 1 ;
            maxC = Math.max(maxC, arr[c-'A'] ) ;

            // int op = (j-i+1) -maxC ;
            while((j-i+1) -maxC>k){
                arr[s.charAt(i)-'A'] = arr[s.charAt(i)-'A'] -1 ; 
                i++ ;
            }
                max = Math.max(max, (j-i+1)) ;

        }

        return max ;
    }
}