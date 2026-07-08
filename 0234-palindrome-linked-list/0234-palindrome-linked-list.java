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
     public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode currnext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currnext;
        }
        return prev;
        }
    public boolean isPalindrome(ListNode head) {
    
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondhalf=reverse(slow.next);
        ListNode firsthalf=head;
        ListNode temp=secondhalf;
        while(temp!=null){
            if(firsthalf.val!=temp.val)return false;
            else{
                firsthalf=firsthalf.next;
                temp=temp.next;
            }
        }
        return true;
    }
}