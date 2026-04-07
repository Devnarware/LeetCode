class Solution {
    public int maxFrequency(int[] arr, int k) {

        
        int n = arr.length;
        if (n <= 1) {
            return n;
        }
        Arrays.sort(arr);

        int max = 0 ;
        long sum = 0 ;

        int i = 0 ;

        for(int j = 0 ; j< n ; j++){
            sum += arr[j] ;

            if((long)arr[j] * (j - i + 1) - sum > k){
                sum = sum - arr[i]  ;
                i++ ;
            }
            max = Math.max(max, (j - i + 1)) ;
        }

        return max ;
    }
}