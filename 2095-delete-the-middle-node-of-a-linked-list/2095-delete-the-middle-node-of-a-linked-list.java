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
    public ListNode deleteMiddle(ListNode head) {
        int mid = length(head)/2;
        
        if(mid == 0) // if list contains only 1 node returning null;
            return null;
        
        ListNode temp = head;
        for(int i = 0; i<mid && head!=null; i++){
            if(i+1 == mid){
                head.next = head.next.next;
                break;
            }
            head = head.next;
        }
        return temp;
    }
    
    public static int length(ListNode head){
        int len = 0;
        while(head!=null){
            len++;
            head = head.next;
        }
        return len;
    }
}