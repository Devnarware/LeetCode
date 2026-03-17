class Solution {
    public List<List<Integer>> threeSum(int[] arr) {


        Set<List<Integer>> result = new HashSet<>() ;


        for(int i = 0 ; i<arr.length-1; i++){

            Set<Integer> set = new HashSet<>() ;
            for(int j = i+1 ; j<arr.length; j++){
                int third = -(arr[i] + arr[j]) ;
                if((set.contains(third)) ){
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third) ;
                    Collections.sort(temp) ;
                    result.add(temp) ;
                }
                set.add(arr[j]) ;
            }
        }

        // result.removeDuplicates() ;
        return new ArrayList<>(result) ;
    }
}