class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>() ;
        List<Integer> list = new ArrayList<>() ; 
        ansMethod(nums, list, ans, 0) ;
        return ans ;
    }

    static void ansMethod(int[] arr , List<Integer> list, List<List<Integer>> ans, int n){
        if(n == arr.length){
            ans.add(new ArrayList<>(list)) ;
            return ;
        }
        list.add(arr[n]) ;
        ansMethod(arr, list, ans, n+1) ;
        list.removeLast() ;
        ansMethod(arr, list, ans, n+1) ;

    }
}