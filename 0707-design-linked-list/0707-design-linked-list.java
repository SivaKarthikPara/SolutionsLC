class MyLinkedList {
    int length = 0; // the number of nodes in the list at any time
    
    class Node 
    {
        int val;
        Node next;
        
        Node(int val)
        {
            this.val = val;
            next = null;
        }
    }
    
    Node head; // head of the list
    Node tail; // the pointer to the last node
    
    // T(n) : O(n)
    public int get(int index) {
      if(index > length - 1) // invalid index
          return -1;
      
        Node temp = head;
        
        while(temp != null && index-->0)
            temp = temp.next;
        
        return temp.val;
    }
    
    // T(n) : O(1)
    public void addAtHead(int val)
    {
        Node node = new Node(val);
        
        if(head == null)
        {
              head = node;
              tail = head;
        }
        else
        {
            node.next = head;
            head = node;
        }
        
        length++; // increase the number of nodes by one
    }
    
    // T(n) : O(1)
    public void addAtTail(int val) 
    {
        Node node = new Node(val);
        
        if(head == null)
            head = node;
        else
            tail.next = node;
        
        tail = node; // update tail to make it point to the last node always
        
        length++; 
    }
    
    // T(n) : O(n)
    public void addAtIndex(int index, int val)
    {         
         if(index > length)
             return;
        
         Node node = new Node(val);
        

         if(index == 0) 
         {
             if(head == null)
             {
                head = node;
                tail = node;
             }
             else
             {
                 node.next = head;
                 head = node;
             }
         }
         else if(index == length)
         {
            tail.next = node;
            tail = node;
         }
         else
         {                          
             Node prev = null;
             Node temp = head;

             while(temp != null && index-->0)
             {
                 prev = temp;
                 temp = temp.next;
             }
             
             prev.next = node;
             node.next = temp;
         }
        
         length++;
    }
    
    // T(n) : O(n)
    public void deleteAtIndex(int index) {
        if(index > length -1) // invalid index
            return;
        
        if(index == 0)
        {
           Node temp = head;
           head = head.next;
           temp.next = null;
           // if there is only 1 node in the list
           if(head == null)
               tail = null; // make tail to null since there is no more nodes left
        }
        else
        {
            Node prev = null;
            Node temp = head;
            
            while(temp != null && index-->0)
            {
                prev = temp;
                temp = temp.next;
            }
            
            prev.next = temp.next;
            temp.next = null;
            
            // if node to be deleted is last node, update tail
            if(temp == tail)
                tail = prev;
        }
        
        length--; // decrease the number of nodes by 1
    }
}

class Node{
    int val;
    Node next;
    public Node(int data){
        this.val = data;
        this.next = null;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */