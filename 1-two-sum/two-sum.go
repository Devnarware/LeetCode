func twoSum(nums []int, target int) []int {
    n := len(nums)
    hmap := make(map[int] int)
    for i := 0 ; i<n ; i++{
        lookingFor := target - nums[i] ;
        index, found := hmap[lookingFor]
        if found{
            return []int{i, index} ;
        }

        hmap[nums[i]] = i ;
    }
    return []int{}
}