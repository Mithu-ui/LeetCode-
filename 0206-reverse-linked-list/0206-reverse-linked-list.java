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
    private ListNode insert(ListNode head,int data){
        if(head==null){
            head=new ListNode(data);
            return head;
        }
        ListNode nn=new ListNode(data);
        nn.next=head;
        head=nn;
        return head;
    }
    public ListNode reverseList(ListNode head) {
        ListNode temp=head,output=null;
        while(temp!=null){
            output=insert(output,temp.val);
            temp=temp.next;
        }
        return output;
    }
}