class Solution {
    public long maximumSubarraySum(int[] arr, int k) {

        long max = 0;
        long sum = 0;
        int dup = 0 ;
        
        Map<Integer, Integer> map = new HashMap<>() ;

        // making a window

        for(int i = 0 ; i < k ; i++){

            if(!map.containsKey(arr[i])){
                map.put(arr[i], 0) ;
            }

            map.put(arr[i], map.get(arr[i]) + 1 ) ;

            sum = sum + arr[i] ;


            if(map.get(arr[i]) > 1){
                dup++ ;
            }

            

        }
        
        if(dup == 0){
                max = Math.max(max, sum) ;
            }

        // now calculating the sum in every window

        for(int i = k ; i < arr.length  ; i++){

            int numToAdd = arr[i] ;
            int numToRemove = arr[i-k] ;

            if(!map.containsKey(numToAdd)){
                map.put(numToAdd, 0) ;
            }

            map.put(numToAdd, map.get(numToAdd) + 1) ;

            sum = sum + numToAdd ;


            if(map.get(numToAdd) > 1){
                dup++ ;
            }

            


            // removing the last int of the window
            sum = sum - numToRemove ;

            if(map.get(numToRemove) > 1){
                dup-- ;
            }

            map.put(numToRemove, map.get(numToRemove) - 1) ;
            
            if(dup == 0){
                max = Math.max(max, sum) ;
            }
        }


        

        return max;
    }
}