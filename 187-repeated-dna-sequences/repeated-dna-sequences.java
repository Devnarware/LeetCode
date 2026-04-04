class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        Set<String> allSubstr = new HashSet<>() ;
        Set<String> res = new HashSet<>() ;

        for(int i = 0 ; i < s.length() - 9 ; i++){
            String subStr = s.substring(i, i+10) ;

            if(allSubstr.contains(subStr)){
                res.add(subStr) ;
                continue ;
            }
            allSubstr.add(subStr) ;
        }

        return new ArrayList<>(res) ;
        
    }
}