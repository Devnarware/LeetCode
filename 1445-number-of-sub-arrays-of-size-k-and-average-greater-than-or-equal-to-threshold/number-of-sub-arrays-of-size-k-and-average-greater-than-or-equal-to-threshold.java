class Solution {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        int target = threshold * k; 
        int j = 0 ;

        while (j < k) {
            sum += arr[j];
            j++;
        }

        while (j < arr.length) {
            if (target <= sum) {
                count++;
            }

            sum = sum + arr[j] - arr[j-k] ;
            j++ ;
        }
            if (target <= sum) {
                count++;
            }

        return count;
    }
}