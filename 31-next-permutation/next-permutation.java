class Solution {
    public void nextPermutation(int[] arr) {
        int pivot = lastIdexOfPeak(arr) - 1 ;
        if(pivot != -1) {
            int nextPrefix = greaterThanPivot(arr, arr[pivot]) ;
            swap(arr, pivot , nextPrefix) ;
        }
        reverse(arr, pivot+1) ;
    }

    int lastIdexOfPeak(int[] arr){
        for(int i = arr.length-1 ; i>0 ; i--){
            if(arr[i]>arr[i-1]){
                return i ;
            }
        }
        return 0 ;
    }

    int greaterThanPivot(int[] arr, int pivot){
        for(int i = arr.length-1 ; i>=0 ; i--){
            if(arr[i]>pivot){
                return i ;
            }
        }
        return -1 ;
    }

    void swap(int[] arr, int i, int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    void reverse(int[] arr, int start){
        int end = arr.length-1 ;
        while(start<=end){
            swap(arr, start, end) ;
            start++ ;
            end-- ;
        }
        

    }
}