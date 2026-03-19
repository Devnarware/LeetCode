class Solution {
    public int appendCharacters(String s, String t) {

        if (s.contains(t)) {
            return 0 ;
        }
        int i = 0;
        int j = 0;
        // int coount = 0 ;
        int m = t.length();
        int n = s.length();

        while (j < m && i < n) {
            if(s.charAt(i) == t.charAt(j)){
                i++ ;
                j++ ;
            }
            else{
                i++ ;
            }
        }
        return m - j;
    }
}