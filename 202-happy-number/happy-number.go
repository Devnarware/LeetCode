func isHappy(n int) bool {
    m := make(map[int] bool)

    for {
        n = helper(n)
        if n == 1{
            return true
        }else if m[n]{
            break ;
        }else{
            m[n] = true
        }
    }

    return false
}

func helper(n int) int{
     sum := 0
     for n>0{
        last_digit := n%10
        sum = sum + (last_digit *last_digit)
        n = n/10
     }
     return sum
}