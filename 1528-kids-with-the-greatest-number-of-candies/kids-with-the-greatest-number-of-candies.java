class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int ec) {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i] ;
            }
        }
        for(int i = 0 ; i<arr.length ; i++){
            if((arr[i]+ec)>=max){
                list.add(true) ;
            }else{
                list.add(false) ;
            }
        }
        return list ;

    }
}