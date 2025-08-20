package main

import "fmt"

type ListNode struct {
	Val  int
	Next *ListNode
}

func mergeTwoLists(list1 *ListNode, list2 *ListNode) *ListNode {
	if list1 == nil && list2 == nil {
		return list1
	}

	temp := &ListNode{}
	pointer := temp

	for list1 != nil && list2 != nil {
		if list1.Val < list2.Val {
			pointer.Next = list1
			list1 = list1.Next
		} else {
			pointer.Next = list2
			list2 = list2.Next
		}
		pointer = pointer.Next
	}

	if list1 == nil {
		pointer.Next = list2
	} else {
		pointer.Next = list1
	}

	return temp.Next
}

func printList(head *ListNode) {
	curr := head
	for curr != nil {
		fmt.Print(curr.Val, " -> ")
		curr = curr.Next
	}
	fmt.Println("nil")
}

func main() {
	list1 := &ListNode{Val: -9, Next: &ListNode{Val: 3, Next: &ListNode{Val: 5}}}

	list2 := &ListNode{Val: 5, Next: &ListNode{Val: 7}}

	result := mergeTwoLists(list1, list2)
	printList(result)
}
