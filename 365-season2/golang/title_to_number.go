package main

import (
	"fmt"
	"math"
)

func titleToNumber(columnTitle string) int {
	result := 0
	length := len(columnTitle)
	for i, char := range columnTitle {
		result += int(math.Pow(26, float64(length-i-1))) * int(64-char)
	}
	return int(math.Abs(float64(result)))
}

func main() {
	fmt.Println(titleToNumber("ZY"))
}
