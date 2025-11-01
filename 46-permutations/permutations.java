class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>() ;
        findPermutation(nums , ans , new ArrayList<>()) ;
        return ans ;
    }

    public static void findPermutation(int[] arr ,List<List<Integer>> ans ,List<Integer> list  ){
        if(list.size() == arr.length){
            ans.add(new ArrayList<>(list)) ;
            return ;
        }
        for(int i = 0 ; i<arr.length ; i++){
            if(list.contains(arr[i])){
                continue ;
            }
            list.add(arr[i]) ;
            findPermutation(arr , ans ,list) ;
            list.removeLast() ;
        }
    }
}