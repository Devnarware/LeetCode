func twoSum(nums []int, target int) []int {
    n := len(nums)
    arr := []int{0,0}
    for i := 0 ; i<n ; i++{
        for j := i+1 ; j<n ; j++{
            if nums[i]+nums[j] == target{
                arr[0] = i
                arr[1] = j
                return arr
            }
        }
    }
    return arr
}