class Solution {
    public String reverseWords(String s) {
        
        // intital s = "   hello   world   "
        String trim = s.trim() ;
        // after trimming trim = "hello   world"

        // now split it
        String[] arr = trim.split("\\s+") ;
        // arr = ["hello", "world"]


        // now reverse it 
        int i = 0 ,
            j = arr.length -1  ;
        
        while(i < j){
            String temp = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = temp ;

            i++ ;
            j-- ;
        }

        
        return String.join(" " , arr) ;
    }
}