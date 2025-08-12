package main

import "fmt"

func nextGreaterElement(nums1 []int, nums2 []int) []int {
	var result []int

	for i := 0; i < len(nums1); i++ {
		in := true
		for j := 0; j < len(nums2); j++ {
			if nums2[j] == nums1[i] {
				for k := j + 1; k < len(nums2); k++ {
					if nums2[k] > nums1[i] {
						result = append(result, nums2[k])
						in = false
						break
					}
				}
				break
			}
		}
		if in {
			result = append(result, -1)
		}
	}

	return result
}

func main() {
	result := nextGreaterElement([]int{2, 4}, []int{1, 2, 3, 4})
	fmt.Println(result)
}
