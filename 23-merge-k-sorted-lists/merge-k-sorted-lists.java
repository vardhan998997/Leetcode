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
        ListNode dummy = new ListNode(0);
        dummy = ismerger(lists[0], lists[1]);

        for(int i = 2;i<n;i++){
           dummy = ismerger(dummy, lists[i]);
        }
        return dummy;
    }

    public ListNode ismerger(ListNode p, ListNode q){
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        ListNode temp1 = p;
        ListNode temp2 = q;

        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                ans.next = temp1;
                ans = ans.next;
                temp1 = temp1.next;
            }else{
                ans.next = temp2;
                ans = ans.next;
                temp2 = temp2.next;
            }
        }
        
        ans.next = temp1;
        while(ans.next!=null){
            ans = ans.next;
        }
        ans.next = temp2;

        return dummy.next;
    }
}
