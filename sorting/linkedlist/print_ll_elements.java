class Solution
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head)
    {

        while(head.next != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.print(head.data);
        

    }
}
