class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {

        ListNode result = new ListNode(0) ;
        ListNode currentNode = result ;

        int carray = 0 ;
        while(l1!=null || l2!=null)
        {
            int sum = 0 ;
            sum = sum+carray ;
            if(l1!=null)
            {
                sum +=l1.val ;
                l1 = l1.next ;
            }

            if(l2!=null)
            {
                sum +=l2.val ;
                l2 = l2.next ;
            }

            carray = sum/10 ;
            sum = sum%10 ;

            currentNode.next = new ListNode(sum);
            currentNode = currentNode.next ;
        }

        if(carray == 1)
        {
            currentNode.next = new ListNode(1);
        }
        return result.next ;
    }
}