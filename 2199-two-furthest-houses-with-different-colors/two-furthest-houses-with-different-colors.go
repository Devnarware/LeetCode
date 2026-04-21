func maxDistance(colors []int) int {
    max := 0 ;
    n := len(colors) ;
    for i := 0; i < n; i++{
        if colors[i] != colors[n-1]{
            max = n - 1 - i ;
            break ;
        }   
    }

    for i := n-1; i>0; i--{
        if colors[0] != colors[i]{
           if max < i{
                max = i ;
           } 
        }
    }

    return max ;
}