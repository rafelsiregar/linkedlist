// A complete working Java program to demonstrate all insertion methods 
// on linked list 
class LinkedList {
    /* Linked list Node*/
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; } 
    } 
  
    /* Inserts a new Node at front of the list. */
    public Node insert_at_front(Node head, int data) 
    { 
        Node node = new Node(data); 
        if(head==null)
          head = node;
        else {
          node.next = head;
          head = node; 
        }
        return head;
    } 
    
    public Node insert_at_tail(Node head, int data){
      Node node = new Node(data);
      if(head==null)
        head = node;
      else {
        Node tail = head;
        while(tail.next!=null) current = current.next;
        current.next = node;
      }
      return head;
    }
  
    /* Inserts a new node after the given prev_node. */
    public Node insert_at_position(Node head, int data, int position) { 
        Node new_node = new Node(data);
        if(head==null){
            head = new_node;
        } else {
            Node temp, current;
            temp = head; current=null;
            for(int i=0;i<position;i++){
                current = temp;
                temp = temp.next;
            }
            //Menyambungkan ke linked list
            current.next = new_node;
            new_node.next = temp;
            }
            return head;
    } 
    
    public Node delete_head(Node head, int data){
      if(head==null)
        return null;
      
       Node temp = head;
       head = head.next;
       
       return head;
    }
    
    public Node delete_tail(Node head, int data){
      if(head==null) return null;
      if(head.next==null) return null;
      
       Node before_tail = head;
       while(before_tail.next.next!=null) before_tail = before_tail.next;
       before_tail.next = null;
       return head;
    }
    
    
  
    /* This function prints contents of linked list starting from 
        the given node */
    public void print_elements(Node head) { 
        while (head != null) { 
            System.out.print(head.data+" "); 
            head = head.next; 
        } 
    } 
  
    /* Driver program to test above functions. Ideally this function 
       should be in a separate user class.  It is kept here to keep 
       code compact */
    public static void main(String[] args) 
    { 
        /* Start with the empty list */
        LinkedList llist = new LinkedList();
  
        System.out.println("\nCreated Linked list is: "); 
        llist.printList(); 
    } 
} 
// This code is contributed by Rajat Mishra 
