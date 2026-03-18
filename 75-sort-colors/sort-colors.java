class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length ;
        int low = 0 ;
        int mid = 0 ;
        int high = n -1 ;

        while(mid <= high){

            if(arr[mid] == 0){
                swap(mid, low, arr);
                mid++ ;
                low ++ ;
            }else if(arr[mid] == 2){
                swap(mid, high, arr) ;
                high-- ;
            }else{
                mid++ ;
            }

        }

    }

    public void swap(int i, int j, int[] arr){
        int temp = arr[i] ;
        arr[i] =arr[j] ;
        arr[j] = temp ;
    }
}