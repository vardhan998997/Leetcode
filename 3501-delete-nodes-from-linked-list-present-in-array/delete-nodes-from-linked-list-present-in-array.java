/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        int maxValue = Arrays.stream(nums).max().getAsInt();
        int[] having = new int[maxValue+1];
        for(int i : nums){
            having[i] = 1;
        }

        ListNode newNode = new ListNode(-1);
        ListNode prev = newNode;
        prev.next = head;

        while(head!=null){
            if(head.val<=maxValue && having[head.val]==1){
                prev.next = head.next;
                head = head.next;
            }else{
                prev = head;
                head = head.next;
            }
        }
        return newNode.next;
    }
}


// class Solution {
//     public ListNode modifiedList(int[] nums, ListNode head) {
//         HashSet<Integer> set = new HashSet<>();

//         for(int num: nums){
//             set.add(num);
//         }

//         ListNode newNode = new ListNode(-1);
//         ListNode prev = newNode;
//         prev.next = head;

//         while(head!=null){
//             if(set.contains(head.val)){
//                 prev.next = head.next;
//                 head = head.next;
//             }else{
//             prev = head;
//             head = head.next;
//             }
//         }

//         return newNode.next;
//     }
// }



// class Solution {
//     public ListNode modifiedList(int[] nums, ListNode head) {
//         HashSet<Integer> set = new HashSet<>();

//         for(int num: nums){
//             set.add(num);
//         }

//         ListNode newNode = new ListNode(-1);
//         ListNode curr = newNode;

        
//         while(head!=null){
//             if(!set.contains(head.val)){
//                 newNode.next = new ListNode(head.val);
//                 newNode = newNode.next;
//             }
//             head = head.next;
//         }

//         return curr.next;
//     }
// }
