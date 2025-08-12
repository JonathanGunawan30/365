package main

//	func reverseString(s []byte) {
//		var result []byte
//		for i := len(s); i > 0; i-- {
//			result = append(result, s[i-1])
//		}
//		copy(s, result)
//	}
func reverseString(s []byte) {
	left, right := 0, len(s)-1
	for left < right {
		s[left], s[right] = s[right], s[left]
		left++
		right--
	}
}

func main() {
	reverseString([]byte("HELLO"))
}
