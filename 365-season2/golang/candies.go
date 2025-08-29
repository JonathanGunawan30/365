package main

import "fmt"

func distributeCandies(candyType []int) int {
	candy := make(map[int]struct{})
	for _, each := range candyType {
		candy[each] = struct{}{}
	}
	return min(len(candyType)/2, len(candy))
}

func main() {
	fmt.Println(distributeCandies([]int{1, 1, 2, 2, 3, 3}))
	fmt.Println(distributeCandies([]int{1, 1, 2, 3}))
	fmt.Println(distributeCandies([]int{6, 6, 6, 6}))
}
