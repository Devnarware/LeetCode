class Solution {
    public int maximumWealth(int[][] arr) {
        int max = Integer.MIN_VALUE ;
        int sum ;
        for(int i = 0 ; i<arr.length ; i++){
            sum = 0 ;
            for(int j = 0 ; j<arr[0].length; j++){
                sum += arr[i][j] ;
            }
            if(sum>max){
                max = sum ;
            }
        }
        return max ;
    }
}