/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var countPairs = function(nums, target) {
    nums.sort((a,b) => a - b) ;

    let i = 0 ;
    let j = nums.length -1 ;
    let count = 0 ;

    while(i < j){

        if(nums[i] + nums[j] < target){
            count += j-i ;
            i++ ;
        }else{
            j-- ;
        }
    }

    return count ;
};