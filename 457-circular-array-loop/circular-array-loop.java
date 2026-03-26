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

            // set :- to check that if we visit on that index or not
            Set<Integer> set = new HashSet<>() ;
            set.add(i) ; // already there so marked as visited

            // a flaf(isPos) -> shows that the vurr element is +ve or -ve
            boolean isPos = nums[i] > 0 ;
            int curr = i ;
            // for checking the loop 
            while(true){

                // get for next idx
                int next = nextIdx(nums, curr) ;

                // checking for curr idx isPos or not
                if(isPos){
                    if(nums[next] < 0){
                        // coz our old num was pos
                        break ;
                    }else{
                        if(set.contains(next)){// checking already visit or not, means finding cycle

                            // have to check is k>1 (isSelf loop)
                            if(curr != next){
                                return true ;
                            }else{
                                break ;
                                // coz we are stuck in the self loop
                            }
                        }

                        set.add(next) ;
                    }
                }else {
                    if(nums[next] > 0){
                        // coz our last num was neg
                        break ;
                    }else{
                        if(set.contains(next)){// checking already visit or not, means finding cycle

                            // have to check is k>1 (isSelf loop)
                            if(curr != next){
                                return true ;
                            }else{
                                break ; // self loop
                            }
                        }
                        set.add(next) ;
                    }
                }

                curr = next ;
            }
        }


        return false ;
    }
}