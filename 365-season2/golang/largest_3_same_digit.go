package main

import (
	"fmt"
	"strings"
)

func largestGoodInteger(num string) string {
	split := strings.Split(num, "")
	var candidate string
	var finalcandidate string
	temp := false
	for i := 0; i < len(split)-1; i++ {
		if temp {
			if split[i+1] == candidate && finalcandidate < candidate {
				finalcandidate = candidate
			}
			temp = false
		}
		if split[i] == split[i+1] {
			candidate = split[i]
			temp = true
		}

	}
	return finalcandidate + finalcandidate + finalcandidate
}

//func largestGoodInteger(num string) string {
//	if strings.Contains(num, "999") {
//		return "999"
//	}
//	if strings.Contains(num, "888") {
//		return "888"
//	}
//	if strings.Contains(num, "777") {
//		return "777"
//	}
//	if strings.Contains(num, "666") {
//		return "666"
//	}
//	if strings.Contains(num, "555") {
//		return "555"
//	}
//	if strings.Contains(num, "444") {
//		return "444"
//	}
//	if strings.Contains(num, "333") {
//		return "333"
//	}
//	if strings.Contains(num, "222") {
//		return "222"
//	}
//	if strings.Contains(num, "111") {
//		return "111"
//	}
//	if strings.Contains(num, "000") {
//		return "000"
//	}
//	return ""
//}

// 6777133339
// 777
func main() {
	fmt.Println(largestGoodInteger("711133310755088231390684011112227777007142226669892017313336662051880002555771116"))
}
