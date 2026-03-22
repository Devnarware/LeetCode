func twoSum(nums []int, target int) []int {
    m := make(map[int] int)
    for i, n := range nums{

        lookingFor := target - n ;
        
        if index, found := m[lookingFor]; found{
            return []int{i, index} ;
        }

        m[n] = i ;
    }
    return nil
}