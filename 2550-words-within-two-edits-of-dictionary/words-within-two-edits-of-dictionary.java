class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        
        // Set<String> set = new HashSet<>() ;
        List<String> list = new ArrayList<>() ;

        for(int i = 0; i<queries.length; i++){
            for(int j = 0; j<dictionary.length; j++){
                if(helper(queries[i], dictionary[j])){
                    list.add(queries[i]) ;
                    break ;
                }
            }
        }



        return list ;

    }

    private boolean helper(String queries, String dictionary){
        int edit = 0 ;
        for(int i = 0; i<queries.length(); i++){
            if(queries.charAt(i) != dictionary.charAt(i)){
                edit++ ;
            }

            if(edit>2){
                return false ;
            }
        }

        return true ;
    }
}