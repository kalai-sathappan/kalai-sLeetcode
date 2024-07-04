/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) { 
        if(head==null){ 
            return false;
        }
        Set<ListNode>st = new HashSet<>(); 
        while(head.next!=null){  
            if(!st.contains(head)){
            st.add(head); 
            } 
            else{ 
                return true;
            } 
            head=head.next;
        } 
        return false;
    }
}