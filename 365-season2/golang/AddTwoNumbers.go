package main

import (
	"math/big"
	"strconv"
)

// UNCOMMAND
//type ListNode struct {
//	Val  int
//	Next *ListNode
//}
//
//func printList(head *ListNode) {
//	curr := head
//	for curr != nil {
//		fmt.Print(curr.Val, " -> ")
//		curr = curr.Next
//	}
//	fmt.Println("nil")
//}

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	first := new(big.Int)
	second := new(big.Int)

	mul := big.NewInt(1)
	ten := big.NewInt(10)

	for l1 != nil {
		term := new(big.Int).Mul(mul, big.NewInt(int64(l1.Val)))
		first.Add(first, term)
		mul.Mul(mul, ten)
		l1 = l1.Next
	}

	mul.SetInt64(1)

	for l2 != nil {
		term := new(big.Int).Mul(mul, big.NewInt(int64(l2.Val)))
		second.Add(second, term)
		mul.Mul(mul, ten)
		l2 = l2.Next
	}

	sum := new(big.Int).Add(first, second)

	newListNode := &ListNode{}
	pointer := newListNode

	total := sum.String()
	reverse := []rune(total)

	for i, j := 0, len(reverse)-1; i < j; i, j = i+1, j-1 {
		reverse[i], reverse[j] = reverse[j], reverse[i]
	}

	for _, r := range reverse {
		digit, _ := strconv.Atoi(string(r))
		pointer.Next = &ListNode{Val: digit}
		pointer = pointer.Next
	}

	return newListNode.Next
}

func main() {
	list1 := &ListNode{Val: 2, Next: &ListNode{Val: 4, Next: &ListNode{Val: 9}}}

	list2 := &ListNode{Val: 5, Next: &ListNode{Val: 6, Next: &ListNode{Val: 4, Next: &ListNode{Val: 9}}}}

	result := addTwoNumbers(list1, list2)
	printList(result)
}
