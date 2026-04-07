class Solution {
    public int maxFrequency(int[] arr, int k) {

        
        int n = arr.length;
        if (n <= 1) {
            return n;
        }
        Arrays.sort(arr);

        int max = 0 ;
        long sum = 0 ;

        int j = 0 ;

        for (int i = 0 ; i < n-1 ; i++){
            while(j < n){
                sum += arr[j] ;
                long total = (long)arr[j] * (j - i + 1) ; // total token
                long token_need = total - sum ;

                if(token_need > k){
                    sum = sum - arr[i] - arr[j]  ;
                    i++ ;
                    continue ;
                }

                max = Math.max(max, (j - i + 1)) ;
                j++ ;

            }
            break ;
        }

       

        return max ;
    }
}