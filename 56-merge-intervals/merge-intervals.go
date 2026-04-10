func merge(intervals [][]int) [][]int {
	// Sort intervals by their start value
	sort.Slice(intervals, func(i, j int) bool {
		return intervals[i][0] < intervals[j][0]
	})

	result := [][]int{intervals[0]}

	for i := 1; i < len(intervals); i++ {
		prev := result[len(result)-1]
		curr := intervals[i]

		if curr[0] <= prev[1] {
			// Merge: expand the end if needed
			if curr[1] > prev[1] {
				prev[1] = curr[1]
			}
		} else {
			result = append(result, curr)
		}
	}

	return result
}