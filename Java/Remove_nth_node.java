class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
           if(head.next==null)
            return null;
        
        ListNode slow=head;
        ListNode fast=head;
        
        for(int i=1;i<=n;i++)
            fast=fast.next;
        
        // edge case handeled when we have to delete the 1st node i.e n=size of linked list
        
        if(fast==null)
            return head.next;
        
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next=slow.next.next;
        return head;
        
        
       
    }
}
