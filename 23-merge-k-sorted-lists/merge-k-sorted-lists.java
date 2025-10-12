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
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n<1) return null;
        if(n==1) return lists[0];
        ListNode merged = lists[0];

        for(int i = 1;i<n;i++){
           merged = ismerger(merged, lists[i]);
        }
        return merged;
    }

    public ListNode ismerger(ListNode temp1, ListNode temp2){
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                ans.next = temp1;
                temp1 = temp1.next;
            }else{
                ans.next = temp2;
                temp2 = temp2.next;
            }
                ans = ans.next;
        }
        
        if(temp1!=null){
            ans.next = temp1;
        }else{
            ans.next = temp2;
        }

        return dummy.next;
    }
}
