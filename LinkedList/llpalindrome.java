package LinkedList;

class Main {
    public static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public static ListNode head;
    public static ListNode tail;
     public void addfirst(int data){
         ListNode newnode = new ListNode(data);
         if(head == null){
             head = tail = newnode;
             return;
         }
         newnode.next = head ;
         head = newnode;
         
     }
     public ListNode findmid(ListNode head){
         ListNode fast = head;
         ListNode slow = head;
         while(fast!=null && fast.next!=null){
             slow = slow.next;
             fast = fast.next.next;
         }
         return slow;
     }
     //to check palindrome
      public boolean ispalindrome(){
          //1find mid
          ListNode mid = findmid(head);
          //reverse second half
          ListNode prev = null;
          ListNode curr = mid;
          ListNode next;
          while(curr!=null){
              next = curr.next;
              curr.next = prev;
              prev = curr;
              curr = next;
          }
          ListNode right = prev;
          ListNode left = head;
          while(right!=null){
              if(right.data!=left.data){
                  return false;
              }
              right = right.next;
              left = left.next;
          }return true;
      }
      public static void main(String args[]){
          Main ll = new Main();
          ll.addfirst(4);
          ll.addfirst(3);
          ll.addfirst(3);
          ll.addfirst(4);
          
          
          System.out.print(ll.ispalindrome());
      }
       //1 find mid
    
}
