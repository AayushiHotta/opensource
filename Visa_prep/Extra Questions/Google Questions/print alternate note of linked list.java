//Given a linked list print the alternate node of a Linked List
class Solution{
  public static void alternate_print(Node head){
    Node fast = head;
    while(fast != null){
      System.out.print(fast.val+" ");
      fast = fast.next.next;
    }
  }
    
}
