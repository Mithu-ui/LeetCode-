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
    public ListNode reverseList(ListNode head) {
        ListNode res=null,temp=head;
        while(temp!=null){
            if(res==null){
                res=new ListNode(temp.val);
            }else{
                ListNode x=new ListNode(temp.val);
                x.next=res;
                res=x;
            }
            temp=temp.next;
        }
        return res;
    }
}