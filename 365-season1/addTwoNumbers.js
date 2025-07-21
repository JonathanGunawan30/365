/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    if(l1 === 0){return 0}
    let let1 = 0, let2 = 0, curr = l1.length;

    for(let i = 0; i < l1.length; i ++){
        curr -= 1;
        let1 = let1 * 10 + l1[curr]
        let2 = let2 * 10 + l2[curr]
    }
    return ((let1 + let2).toString().split('').reverse().map(Number))
};

console.log(addTwoNumbers([2,4,3], [5,6,4]));