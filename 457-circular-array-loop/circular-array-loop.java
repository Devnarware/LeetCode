class Solution {

    private int nextIdx(int[] arr, int curr){
        int next = curr ;
        int seq = arr[curr] ;

        if(seq > 0){
            next = (next + seq) % arr.length ;
        }else{
            int mod = seq % arr.length ;
            int forward = mod + arr.length ;
            next = (curr + forward) % arr.length ;
        }
        return next ;
    }

    public boolean circularArrayLoop(int[] nums) {
        // chech all indexes

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] == 0){
                continue ;
            }
            boolean isPos = nums[i] > 0 ;

            int fast = i ;
            int slow = i ;

            do{
                slow = nextIdx(nums, slow) ;

                fast = nextIdx(nums, fast) ;
                if(isPos){
                    if(nums[fast] < 0){
                        break ;
                    }
                }else{
                    if(nums[fast] > 0){
                        break ;
                    }
                }

                fast = nextIdx(nums, fast) ;

                if(isPos){
                    if(nums[fast] < 0){
                        break ;
                    }
                }else{
                    if(nums[fast] > 0){
                        break ;
                    }
                }

                if( slow == fast){
                    if(slow != nextIdx(nums, slow) ){
                        return true ;
                    }
                    break ;
                }
            }while(slow != fast) ;
            
            int curr = i ;
            if(isPos){
                while(nums[curr] > 0){
                    int next = nextIdx(nums, curr) ;
                    nums[curr] = 0 ;
                    curr = next ;
                }
            }else{
                while(nums[curr] < 0){
                    int next = nextIdx(nums, curr) ;
                    nums[curr] = 0 ;
                    curr = next ;
                }
            }
        }


        return false ;
    }
}