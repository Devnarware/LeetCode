class Solution {
    public int totalFruit(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>() ;

        int i = 0 ; 
        int j = 0 ;
        int max = 0 ;

        while(j < arr.length){
            map.put(arr[j], map.getOrDefault(arr[j], 0) +1 );

            if (map.size() > 2){
                map.put(arr[i], map.get(arr[i]) - 1) ;
                if(map.get(arr[i]) == 0){
                    map.remove(arr[i]) ;
                }
                i++ ;
            }
            max = Math.max(max, j - i + 1) ;
            j++ ;
        }

        return max ;
    }
}