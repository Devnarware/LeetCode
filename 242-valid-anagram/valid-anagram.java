class Solution {
    public boolean isAnagram(String s, String t) {
        int sSize = s.length() ;
        int tSize = t.length() ;
        if(sSize != tSize){
            return false ;
        }
        int[] forS = new int[sSize] ;
        int[] forT = new int[tSize] ;
        for(int i = 0 ; i < sSize ; i++){
            forS[i] = s.charAt(i) - '0' ;
            forT[i] = t.charAt(i) - '0' ;
        }
        Arrays.sort(forS) ;
        Arrays.sort(forT) ;

        for(int i = 0 ; i < sSize ; i++){
            if(forS[i] != forT[i]){
                return false ;
            }
        }

        return true ;
    }
}