class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>() ;
        Arrays.sort(nums);
         boolean[] visited = new boolean[nums.length] ;
        findPermutation(nums , ans , new ArrayList<>(),  visited , 0) ;
        return ans ;
    }

    public static void findPermutation(int[] arr ,List<List<Integer>> ans ,List<Integer> list , boolean[] visited , int idx  ){
        if(idx == arr.length){
            ans.add(new ArrayList<>(list)) ;
            return ;
        }
        for(int i = 0 ; i<arr.length ; i++){
            if(i>0 && arr[i] == arr[i-1] && visited[i-1]){
                continue ;
            }
            if(!visited[i]){
                visited[i] = true ;
                list.add(arr[i]) ;
                findPermutation(arr , ans ,list , visited , idx+1) ;
                list.removeLast() ;
                visited[i] = false ;

            }
        }
    }
}