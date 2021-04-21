class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        if(head.next == null) return 0;
        int count = 1;
        while(head.next!=null){
            count++;
            head = head.next;
        }
        return count;
    }
}
