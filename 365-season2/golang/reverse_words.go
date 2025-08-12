package main

import (
	"fmt"
	"strings"
)

func reverseWords(s string) string {
	word := strings.Split(s, " ")
	var result []byte
	for _, each := range word {
		var temp []byte
		for i := len(each); i > 0; i-- {
			temp = append(temp, each[i-1])
		}
		result = append(result, temp...)
		result = append(result, ' ')
		fmt.Println(result)
	}

	if len(result) > 0 {
		result = result[:len(result)-1]
	}
	return string(result)

}

func main() {
	fmt.Println(reverseWords("Hello world"))
}
