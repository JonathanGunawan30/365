package main

import (
	"fmt"
)

func lengthOfLongestSubstring(s string) int {
	candidate := make(map[rune]int)

	maxLen := 0
	start := 0

	for i, char := range s {
		if lastSeenIndex, found := candidate[char]; found && lastSeenIndex >= start {
			start = lastSeenIndex + 1
		}

		candidate[char] = i

		current := i - start + 1

		if current > maxLen {
			maxLen = current
		}
	}

	return maxLen
}

func main() {
	fmt.Println(lengthOfLongestSubstring("abcabcbb"))
}
