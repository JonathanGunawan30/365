package main

import (
	"fmt"
	"math"
)

func isPowerOfThree(n int) bool {
	// return n%3 == 0 && n > 0
	// return int(math.Pow(float64(n%6), 3)) == n && n > 0
	// return n%6 == 3 && n > 0
	if n <= 0 {
		return false
	}
	exp := math.Round(math.Log(float64(n)) / math.Log(3))
	return int(math.Pow(3, exp)) == n
}

// 3     9     27     81     243     729     2187     6561     19683     59049

// 8 27 64 125 216 343 512 729
// 2 3  4  5   6
// 30 45 90 120 150

func main() {
	fmt.Println(isPowerOfThree(45))
}
