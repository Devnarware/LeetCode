class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        Arrays.sort(arr) ;
        List<List<Integer>> ans = new ArrayList<>() ;
        List<Integer> list = new ArrayList<>() ;
        helper(arr , ans , list , target , 0) ;
        return ans ;
    }

    public static void helper(int[] arr ,List<List<Integer>> ans ,  List<Integer> list , int remain , int start){

        if(remain<0){
            return ;
        }else if(remain == 0){
            ans.add(new ArrayList<>(list)) ;
        }else{
            for(int i = start ; i<arr.length ; i++){
                if(i>start && arr[i] == arr[i-1]){
                    continue ;
                }
                list.add(arr[i]) ;
                helper(arr , ans , list , remain - arr[i] , i) ;
                list.removeLast() ;
            }
        }

    }
}